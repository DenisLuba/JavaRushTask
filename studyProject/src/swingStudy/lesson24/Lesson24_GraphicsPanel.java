package swingStudy.lesson24;

import javax.swing.*;
import java.awt.*;

public class Lesson24_GraphicsPanel extends JPanel {
        private  Lesson24_Line line;

        public Lesson24_GraphicsPanel() {
            line = new Lesson24_Line(0, 0, 600, 200);
        }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(line);
    }
}
