package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson4_JLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel label = new JLabel(); // в конструктор можно передать текст
        // это просто надпись, с которой можно работать только в бэкэнде,
        // т.е. в пользовательском интерфейсе она не активна. На нее можно воздействовать
        // посредством других компонентов, если будет написано соответствующее поведение

        label.setSize(500, 200);
        label.setText("Jlabel");
        label.setFont(new Font("TimesNewRoman", Font.ITALIC, 25)); // создали новый шрифт
        label.setBackground(new Color(22, 55, 255)); // фон не отображается почему-то
        label.setForeground(new Color(255, 55, 10));
        System.out.println(label.getText());

        frame.add(label);
        frame.setVisible(true);
    }
}
