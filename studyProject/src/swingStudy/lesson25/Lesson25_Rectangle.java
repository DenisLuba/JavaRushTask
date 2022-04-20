package swingStudy.lesson25;

import java.awt.geom.Rectangle2D;

// ПРЯМОУГОЛЬНИК И КВАДРАТ
public class Lesson25_Rectangle extends Rectangle2D {
    private Lesson25_Point point;
    private double width, height;

    public Lesson25_Rectangle(double x, double y, double width, double height) {
        point = new Lesson25_Point(x, y);
        this.width = width;
        this.height = height;
    }

    public Lesson25_Rectangle() {
        point = new Lesson25_Point();
    }

    @Override
    public void setRect(double x, double y, double w, double h) {
        point.setLocation(x, y);
        width = w;
        height = h;
    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
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
}
