package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson20_JMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 400));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());


        // Menu bars
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu searchMenu = new JMenu("Search");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(searchMenu);
        menuBar.add(helpMenu);


        // Add new item for menu File
        JMenuItem createItem = new JMenuItem("Create");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save as...");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add ActionListener for exit item
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("exit");
                System.exit(1);
            }
        });

        fileMenu.add(createItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();

        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();

        fileMenu.add(exitItem);

        // Add new item for menu Edit
        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem returnItem = new JMenuItem("Return");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(undoItem);
        editMenu.add(returnItem);
        editMenu.addSeparator();

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);


        // Set menu bar for frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
