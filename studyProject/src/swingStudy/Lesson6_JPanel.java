package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson6_JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(); // панель - это компонент типа frame, но без рамки.
        // на ней можно размещать другие панели и компоненты; она работает как контейнер,
        // расширяется по размеру внутренних компонентов
        JPanel panel1 = new JPanel();


        JButton button = new JButton("JButton");

        panel.setBackground(Color.YELLOW);
        panel1.setBackground(Color.GREEN);
        panel.setSize(100, 500); // не работает

        panel.add(button);
        panel.add(panel1); // добавили одну панель на другую вместе с кнопкой
        frame.add(panel);
        Component [] components = panel.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof  JPanel) {
                System.out.println("panel");
            }
            if (components[i] instanceof  JButton) {
                String titleButton = ((JButton) components[i]).getText();
                System.out.println(titleButton);
            }
        }
        frame.setVisible(true);
    }
}
