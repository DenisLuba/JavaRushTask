package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson7_BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout()); // создаем макет расположения элементов
        // в пяти местах: сверху, снизу, справа, слева, по-центру

        JButton button = new JButton("Button");
        frame.add(button, BorderLayout.PAGE_START); // в параметрах указываем, что кнопка
        // расположена на верху страницы с помощью константы PAGE_START

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.YELLOW);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.RED);
        panel5.setBackground(Color.GRAY);

//        frame.add(panel1, BorderLayout.PAGE_START); // сверху
//        frame.add(panel2, BorderLayout.PAGE_END); // снизу
//        frame.add(panel3, BorderLayout.LINE_END); // справа
//        frame.add(panel4, BorderLayout.LINE_START); // слева
//        frame.add(panel5, BorderLayout.CENTER); // центр

        frame.add(panel1, BorderLayout.NORTH); // сверху
        frame.add(panel2, BorderLayout.SOUTH); // снизу
        frame.add(panel3, BorderLayout.EAST); // справа
        frame.add(panel4, BorderLayout.WEST); // слева
        frame.add(panel5, BorderLayout.CENTER); // центр

        panel3.setLayout(new BorderLayout());
        JButton button1 = new JButton("button1");
        panel3.add(button1, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
