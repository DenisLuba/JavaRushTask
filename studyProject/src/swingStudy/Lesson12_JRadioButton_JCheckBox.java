package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Lesson12_JRadioButton_JCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JRadioButton radioButton = new JRadioButton("Радио кнопка");
        JCheckBox checkBox = new JCheckBox("Флажок");
        JButton button = new JButton(new AbstractAction() { // устанавливаем слушателя в конструкторе
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ft = radioButton.isSelected(); // проверяем, стоит ли точка на радио кнопке
                System.out.println("ft = " + radioButton.getText() + " - " + ft);
            }
        });
        button.setText("Кнопка");
        frame.add(radioButton, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(20, 20, 5, 20), 0, 0));
        frame.add(checkBox, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 20, 5, 20), 0, 0));
        frame.add(button, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 20, 20, 20), 0, 0));

        frame.pack();
        frame.setVisible(true);
    }
}
