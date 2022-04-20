package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson18_JColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame");
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("text text text text text text text text text text text text text text text text");
        JButton button = new JButton("Chooser color");

        JColorChooser colorChooser = new JColorChooser();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = colorChooser.getColor();
                label.setForeground(c);
            }
        });

        panel.add(label, BorderLayout.SOUTH);
        panel.add(button, BorderLayout.NORTH);

        frame.add(colorChooser, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.pack();
    }

}
