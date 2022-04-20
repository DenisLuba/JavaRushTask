package swingStudy;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Lesson13_JTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        TableModel tableModel = new TableModel(); // создаем элемент с параметрами таблицы
        JTable table = new JTable(tableModel); // создаем таблицу с параметрами в конструкторе
        JScrollPane tableScrollPane = new JScrollPane(table); // создаем прокрутку таблицы
        table.setPreferredSize(new Dimension(400, 350)); // задаем размер окна прокрутки
        // и, соответственно, таблицы

        String [] strings = new String[4]; // создаем строку таблицы - массив строк-значений ячеек таблицы
        strings[0] = "0";
        strings[1] = "name book";
        strings[2] = "299999";
        strings[3] = "about book";

        tableModel.addDate(strings); // добавляем строку таблицы в таблицу
        for (int i = 0; i < 100; i++) tableModel.addDate(new String[]{String.valueOf(i), "name book", String.valueOf(1000 + i), "about book"});

        System.out.println(tableModel.getValueAt(0, 2)); // получаем значение из 1 строки 3 ячейки таблицы

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton clearButton = new JButton("Clear Row");

        // добавляем прокрутку, внутри которой наша таблица
        frame.add(tableScrollPane, new GridBagConstraints(0, 0, 3, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                new Insets(1, 1, 1, 1), 0, 0));

        frame.add(addButton, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        frame.add(deleteButton, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        frame.add(clearButton, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));



        frame.setVisible(true);
        //frame.pack();
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

        public void addDate(String[] row) {
            String[] rowTable = new String[getColumnCount()];
            rowTable = row;
            dataArrayList.add(rowTable);
        }
    }
}
