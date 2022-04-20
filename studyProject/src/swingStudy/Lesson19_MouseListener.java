package swingStudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Lesson19_MouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FRAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(600, 400));
        frame.setLayout(new GridBagLayout());

        final JLabel label = new JLabel("The Label");
        frame.add(label);

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked");
                label.setForeground(Color.RED);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed");
                label.setForeground(Color.GREEN);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited");
            }
        });

        frame.setVisible(true);
        //frame.pack();
    }
}
