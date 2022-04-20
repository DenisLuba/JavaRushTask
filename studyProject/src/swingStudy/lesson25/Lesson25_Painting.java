package swingStudy.lesson25;

import javax.swing.*;
import java.awt.*;

public class Lesson25_Painting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        Lesson25_GraphicsPanel graphicsPanel = new Lesson25_GraphicsPanel();

        frame.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.setVisible(true);
    }
}
