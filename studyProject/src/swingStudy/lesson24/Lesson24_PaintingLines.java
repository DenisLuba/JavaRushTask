package swingStudy.lesson24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Lesson24_PaintingLines {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame");

        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        Button button = new Button("Line");
        button.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        Lesson24_GraphicsPanel graphicsPanel = new Lesson24_GraphicsPanel();

        frame.add(button, new GridBagConstraints(0, 0, 1, 1, 0.01, 0.03,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(5, 20, 2, 500), 0, 0));
        frame.add(graphicsPanel, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));


        frame.setVisible(true);
    }

}
