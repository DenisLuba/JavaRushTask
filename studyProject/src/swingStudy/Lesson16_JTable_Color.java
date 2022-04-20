package swingStudy;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Lesson16_JTable_Color {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        BookPanel bookPanel = new BookPanel();
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
            for (int i = 0; i < dataArrayList.size(); i++) {
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
            return dataArrayList.get(rowIndex)[columnIndex];
        }

        public void addData(String[] row) {
            String[] rowTable = new String[getColumnCount()];
            rowTable = row;
            dataArrayList.add(rowTable);
        }
    }

    public static class BookPanel extends JPanel implements Runnable {

        private TableModel tableModel = new TableModel();
        private JTable bookTable = new JTable(tableModel);

        private JButton addButton = new JButton("Добавить");
        private JButton deleteButton = new JButton("Удалить");
        private JButton clearButton = new JButton("Очистить");

        public BookPanel() {
            setLayout(new GridBagLayout());

            new Thread(this).start();
        }

        public void init() {
            for (int i = 0; i < tableModel.getColumnCount(); i++)
                bookTable.getColumnModel().getColumn(i).setCellRenderer(new Renderer(new Color(45, 25, 5), new Color(195, 180, 100)));

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
            tableModel.addData(new String[]{
                    "1122", "Hello world", "12298789", "description"
            });
            tableModel.addData(new String[]{
                    "1123", "Good bye", "12298788", "description"
            });
            tableModel.addData(new String[]{
                    "1124", "Good morning", "12298787", "description"
            });
            tableModel.addData(new String[]{
                    "1125", "Evening", "12298786", "description"
            });
            tableModel.addData(new String[]{
                    "1126", "Night", "12298785", "description"
            });
            tableModel.addData(new String[]{
                    "1126", "Night", "12298785", "description"
            });
            tableModel.addData(new String[]{
                    "1126", "Night", "12298785", "description"
            });
            tableModel.addData(new String[]{
                    "1126", "Night", "12298785", "description"
            });
            tableModel.addData(new String[]{
                    "1126", "Night", "12298785", "description"
            });
            tableModel.addData(new String[]{
                    "1126", "Night", "12298785", "description"
            });
            super.repaint();
        }
    }

    private static class buttonAddListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class Renderer extends DefaultTableCellRenderer { // класс описывает оформление ячеек
        Color font;
        Color background;

        public Renderer() {
            background = Color.WHITE;
            font = Color.BLACK;
        }

        public Renderer(Color color) {
            background = color;
        }

        public Renderer(Color found, Color background) {
            this.background = background;
            this.font = font;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (row % 2 == 0) {
                cell.setBackground(background);
                cell.setForeground(font);
            }
            else cell.setBackground(new Color(105, 130, 210));

            if (isSelected) { // если строка выделена, то она закрашивается в выбраный цвет
                cell.setBackground(new Color(125, 220, 220));
                cell.setForeground(new Color(120, 75, 175));
            }


            return cell;
        }
    }
}
