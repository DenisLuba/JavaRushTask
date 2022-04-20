package swingStudy;

import javax.swing.*;
import java.awt.*;

public class Lesson22_JMenuItem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame");
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");
        JMenu menu2 = new JMenu("Menu 2");

        JMenuItem itemMenu1 = new JMenuItem("Item 1"); // не будет выпадающего списка
        JMenuItem itemMenu2 = new JMenuItem("Item 2");
        JMenu itemMenu3 = new JMenu("Item 3"); // можно добавить выпадающий список
        JMenu itemMenu4 = new JMenu("Item 4");
        JMenu itemMenu5 = new JMenu("Item 5");

        JMenuItem subItem1 = new JMenuItem("subMenu 1"); // больше нельзя добавлять выпадающий список
        JMenuItem subItem2 = new JMenuItem("subMenu 2");
        JMenuItem subItem3 = new JMenuItem("subMenu 3");
        JMenu subItem4 = new JMenu("subMenu 4"); // можно добавить следующий выпадающий список

        itemMenu3.setIcon(new ImageIcon("2.png")); // добавляем подготовленную иконку
        itemMenu1.setIcon(new ImageIcon("1.png"));

        itemMenu3.add(subItem1);
        itemMenu3.add(subItem2);
        itemMenu3.add(subItem3);
        itemMenu3.add(subItem4);

        JMenuItem subSubMenu = new JMenuItem("subSubMenu");
        subItem4.add(subSubMenu);

        menu1.add(itemMenu1);
        menu1.add(itemMenu2);
        menu1.add(itemMenu3);
        menu1.add(itemMenu4);
        menu1.add(itemMenu5);

        menuBar.add(menu1);
        menuBar.add(menu2);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("3.png")); // добавляем подготовленную иконку


        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

        frame.setVisible(true);
        //frame.pack();
    }
}
