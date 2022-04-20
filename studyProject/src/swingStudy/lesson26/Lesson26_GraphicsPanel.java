package swingStudy.lesson26;

import javax.swing.*;
import java.awt.*;

public class Lesson26_GraphicsPanel extends JPanel implements Runnable {
//    private Lesson26_Rectangle rectangle;
//    private Lesson26_Circle circle;
//    private Lesson26_RoundRectangle roundRectangle;
    private Lesson26_Line line;

    public Lesson26_GraphicsPanel() {
//        rectangle = new Lesson26_Rectangle(170, 200, 75, 100);
//        circle = new Lesson26_Circle(100, 250, 75, 75);
//        roundRectangle = new Lesson26_RoundRectangle(450, 100, 125, 78, 55, 25);
        line = new Lesson26_Line(300, 100, 300, 200);
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // если удалить, то каждый предыдущий нарисованный кадр остается
        Graphics2D g2 = (Graphics2D) g;
        //((Graphics2D) g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC)); // настраивается альфа-канал (прозрачность и тд.) Необязателен здесь
        g2.draw(line);
//        g2.draw(rectangle);
//        g2.draw(circle);
//        g2.draw(roundRectangle);
    }

    @Override
    public void run() {
        while(true) {
            try {
                line.movie();
                super.repaint(); // перерисовывает каждый кадр
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}