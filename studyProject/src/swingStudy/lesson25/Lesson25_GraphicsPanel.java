package swingStudy.lesson25;

import javax.swing.*;
import java.awt.*;

public class Lesson25_GraphicsPanel extends JPanel {
    private Lesson25_Rectangle rectangle;
    private Lesson25_Circle circle;
    private Lesson25_RoundRectangle roundRectangle;

    public Lesson25_GraphicsPanel() {
        rectangle = new Lesson25_Rectangle(170, 200, 75, 100);
        circle = new Lesson25_Circle(100, 250, 75, 75);
        roundRectangle = new Lesson25_RoundRectangle(450, 100, 125, 78, 55, 25);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(rectangle);
        g2.draw(circle);
        g2.draw(roundRectangle);
    }
}
