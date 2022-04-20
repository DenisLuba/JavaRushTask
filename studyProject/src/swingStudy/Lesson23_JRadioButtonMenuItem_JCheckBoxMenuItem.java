package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson23_JRadioButtonMenuItem_JCheckBoxMenuItem {
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

        JMenu subSubMenu = new JMenu("subSubMenu");
        subItem4.add(subSubMenu);

        // Добавляем JCheckBox, JRadioButton в меню
        JRadioButton r1 = new JRadioButton("radio button 1");
        JRadioButton r2 = new JRadioButton("radio button 2");
        JRadioButton r3 = new JRadioButton("radio button 3");
        JCheckBox c1 = new JCheckBox("check box 1");
        JCheckBox c2 = new JCheckBox("check box 2");
        JCheckBox c3 = new JCheckBox("check box 3");

        // группировка JRadioButtons, чтобы из трех можно было выбрать только один
        // то же можно сделать с JCheckBox
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        // добавляем JRadioButtons и JCheckBoxes к разным пунктам
        subSubMenu.add(r1);
        subSubMenu.add(r2);
        subSubMenu.add(r3);
        itemMenu4.add(c1);
        itemMenu4.add(c2);
        itemMenu4.add(c3);

        // другие JRadioButtons и JCheckBoxes для Menu
        JRadioButtonMenuItem rm1 = new JRadioButtonMenuItem("radio button 1");
        JRadioButtonMenuItem rm2 = new JRadioButtonMenuItem("radio button 2");
        JRadioButtonMenuItem rm3 = new JRadioButtonMenuItem("radio button 3");
        JCheckBoxMenuItem cm1 = new JCheckBoxMenuItem("check box 1");
        JCheckBoxMenuItem cm2 = new JCheckBoxMenuItem("check box 2");

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rm1);
        buttonGroup1.add(rm2);
        buttonGroup1.add(rm3);
        buttonGroup1.add(cm1);
        buttonGroup1.add(cm2);

        itemMenu5.add(rm1);
        itemMenu5.add(rm2);
        itemMenu5.add(rm3);
        itemMenu5.add(cm1);
        itemMenu5.add(cm2);

        // в пункт меню можно добавить любой компонент
        JButton button = new JButton("button");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(rm1.isSelected());
            }
        });
        itemMenu5.add(button);

        // добавляем пункты к меню 1
        menu1.add(itemMenu1);
        menu1.add(itemMenu2);
        menu1.add(itemMenu3);
        menu1.add(itemMenu4);
        menu1.add(itemMenu5);

        // добавляем две меню на menuBar, т.е. на верхнюю панель
        menuBar.add(menu1);
        menuBar.add(menu2);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("3.png")); // добавляем подготовленную иконку

        // добавляем панель menuBar в наше окошко
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
        //frame.pack();
    }
}
