package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson9_GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 400);
        //frame.setLayout(new GridLayout(2, 3)); // Layout делит форму в сеточку на условно одинаковые клетки
        // если в конструктор ввести 2 числа, то первое будет обозначать количество строк,
        // а второе - количество колонок;
        // если не вводить числа, то рамка разобьется на колонки, в зависимости от количества элементов

        frame.setLayout(new BorderLayout());

        JPanel panelCenter = new JPanel(new GridLayout(4, 3));
        JPanel panelNorth = new JPanel(new BorderLayout());

        JButton button1 = new JButton("JButton1");
        JButton button2 = new JButton("JButton2");
        JButton button3 = new JButton("JButton3");
        JButton button4 = new JButton("JButton4");
        JButton button5 = new JButton("JButton5");
        JButton button6 = new JButton("JButton6");
        JButton button7 = new JButton("JButton7");
        JButton button8 = new JButton("JButton8");
        JButton button9 = new JButton("JButton9");
        JButton button0 = new JButton("JButton0");

//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
//        frame.add(button5);
//        frame.add(button6);
//        frame.add(button7);
//        frame.add(button8);
//        frame.add(button9);
//        frame.add(button0);

        panelCenter.add(button1);
        panelCenter.add(button2);
        panelCenter.add(button3);
        panelCenter.add(button4);
        panelCenter.add(button5);
        panelCenter.add(button6);
        panelCenter.add(button7);
        panelCenter.add(button8);
        panelCenter.add(button9);
        panelCenter.add(button0);

        JTextField textField = new JTextField(10);
        panelNorth.add(textField, BorderLayout.CENTER);

        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelNorth, BorderLayout.NORTH);


        frame.setVisible(true);
    }
}
