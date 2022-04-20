package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson8_FlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // установление относительного места расположения на экране
        // frame.setLayout(new FlowLayout()); // располагает компоненты по центру сверху-вниз
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout()); // создали панель с правилом расположения элементов внутри
        // панели по FlowLayout
        panel.setBackground(Color.RED);
        panel.setPreferredSize(new Dimension(600, 100)); // установка предпочтительного размера панели

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JTextField textField = new JTextField(10);

        panel.add(button1); // в конструктор не надо передавать константы layouts, как в BorderLayout
        // для указания места расположения
        panel.add(textField);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        frame.add(panel, BorderLayout.SOUTH);

//        JButton[] buttons = new JButton[100];
//        for (int i = 1; i <= buttons.length; i++) {
//            frame.add(new JButton(String.valueOf(i)));
//        }

        frame.setVisible(true);
    }
}
