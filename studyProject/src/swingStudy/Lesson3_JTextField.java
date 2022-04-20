package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson3_JTextField {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFrame");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());


        //JTextField textField = new JTextField("JTextField111"); // создаем новое поле для ввода текста,
        // в конструкторе можно указать текст, который сразу будет на поле для ввода.
        // размер поля для ввода будет по длине текста
        JTextField textField = new JTextField(10); // или размер поля для ввода текста
        //textField.setText("JTextField"); можно setText ввести текст в поле для ввода текста

        System.out.println(textField.getText()); // геттер возвращает что-то, в данном случае - текст
        textField.setEditable(true); // если true (или метод не применен), то пользователь может что-то
        // вводить в поле для ввода, если false, то не может ничего вводить в это поле
        textField.setBackground(Color.BLUE);

        JPasswordField passwordField = new JPasswordField(10); // то же, что и тип JTextField,
        // но при введении текста в поле ввода применяется маскировка (знаки, буквы, цифры
        // подменяются, например, звездочками

        JButton button = new JButton("JButton");

        frame.add(passwordField);
        frame.add(button);
        frame.add(textField); // добавляем поле текста в рамку
        frame.setVisible(true); // лучше в конце ставить видимость всей рамки,
        // тогда все компоненты на ней тоже будут видимыми
    }
}
