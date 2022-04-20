package swingStudy.lesson25;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

// ЭЛЛИПС И КРУГ
public class Lesson25_Circle extends Ellipse2D {
    private Lesson25_Point point;
    private double width, height;
    private Lesson25_Rectangle rectangle;

    public Lesson25_Circle() {
        point = new Lesson25_Point();
    }

    public Lesson25_Circle(double x, double y, double width, double height) {
        point = new Lesson25_Point(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getX();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return (width <= 0) || (height <= 0);
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        point.setLocation(x, y);
        width = w;
        height = h;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return rectangle;
    }
}
