package swingStudy;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Lesson15_JTable_Multithreading {
    public static void main(String[] args) {
        ConnectionDb connect = new ConnectionDb("localhost", "root", "123");
        connect.setNameDataBasses("lesson");
        connect.initProperties();
        connect.init();

        JFrame frame = new JFrame("JFrame");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        BookPanel bookPanel = new BookPanel(connect);
        bookPanel.init();

        frame.add(bookPanel, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.pack();
    }

    public static class TableModel extends AbstractTableModel { // создадим класс-модель таблицы

        private int columnCount = 4;

        private ArrayList<String[]> dataArrayList;

        public TableModel() {
            dataArrayList = new ArrayList<>();
            for(int i = 0; i < dataArrayList.size(); i++) {
                dataArrayList.add(new String[getColumnCount()]);
            }
        }

        @Override
        public int getRowCount() {  // возвращает количество строк в таблице
            return dataArrayList.size();
        }

        @Override
        public int getColumnCount() { // возвращает количество колонок в таблице
            return columnCount;
        }

        @Override
        public String getColumnName(int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return "#id";
                case 1:
                    return "title";
                case 2:
                    return "isbn";
                case 3:
                    return "description";
            }
            return "";
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) { // получает значение с определенной ячейки в таблице
            return dataArrayList.get(rowIndex) [columnIndex];
        }

        public void addData(String[] row) {
            String[] rowTable = new String[getColumnCount()];
            rowTable = row;
            dataArrayList.add(rowTable);
        }

        public void addData(ConnectionDb connect) {
            ResultSet result = connect.resultSetQuery("SELECT * FROM book");
            dataArrayList.clear();
            try {
                while(result.next()) {
                    String id = result.getString("id");
                    String title = result.getString("title");
                    String isbn = result.getString("isbn");
                    String description = result.getString("description");

                    String[] row = {
                            result.getString("id"),
                            result.getString("title"),
                            result.getString("isbn"),
                            result.getString("description")
                    };
                    addData(row);
                }
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ConnectionDb {
        private String host;
        private String dataDb;
        private String root;
        private String password;
        private String url;

        private Properties properties = new Properties();
        private Connection mysqlConnection;

        public ConnectionDb(String host, String root, String password) {
            this.host = host;
            this.root = root;
            this.password = password;
        }

        public ConnectionDb(String url, Properties properties) {
            this.url = url;
            this.properties = properties;
        }

        public void setNameDataBasses(String dataDb) {
            this.dataDb = dataDb;
        }

        public void initProperties() {
            this.url = "jdbc:mysql://" + this.host + "/" + this.dataDb;

            properties.setProperty("user", this.root);
            properties.setProperty("password", this.password);
            properties.setProperty("useUnicode", "true");
            properties.setProperty("characterEncoding", "UTF-8");

            System.out.println(url);
        }
        public int init() {
            if (mysqlConnection != null) {
                try {
                    mysqlConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                mysqlConnection = DriverManager.getConnection(url, properties);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return -1;

            } catch (SQLException e) {
                e.printStackTrace();
                return -1;
            }
            return 0;
        }

        public void finalize() {
            try {
                mysqlConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public ResultSet resultSetQuery(String query) {
            try {
                Statement stmt = mysqlConnection.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                return rs;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        public void sqlQuery(String query) {
            try {
                Statement stmt = mysqlConnection.createStatement();
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static class BookPanel extends JPanel implements Runnable {
        private ConnectionDb connect;
        private TableModel tableModel = new TableModel();
        private JTable bookTable = new JTable(tableModel);

        private JButton addButton = new JButton("Добавить");
        private JButton deleteButton = new JButton("Удалить");
        private JButton clearButton = new JButton("Очистить");

        public BookPanel(ConnectionDb connect) {
            this.connect = connect;
            setLayout(new GridBagLayout());

            new Thread(this).start();
        }

        public void init() {
            JScrollPane scrollPane = new JScrollPane(bookTable);
            scrollPane.setPreferredSize(new Dimension(400, 400));

            add(scrollPane, new GridBagConstraints(0, 0, 3, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(20, 10, 5, 10), 0, 0));

            add(addButton, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(1, 1, 1, 1), 0, 0));

            add(deleteButton, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(1, 1, 1, 1), 0, 0));

            add(clearButton, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(1, 1, 1, 1), 0, 0));

        }

        @Override
        public void run() {
            while (true) {
                try {
                    tableModel.addData(connect);
                    super.repaint();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
