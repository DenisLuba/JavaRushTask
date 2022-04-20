package swingStudy.lesson25;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

// ПРЯМОУГОЛЬНИК И КВАДРАТ С ЗАКРУГЛЕННЫМИ УГЛАМИ

public class Lesson25_RoundRectangle extends RoundRectangle2D {
    private Lesson25_Point point;
    private double width, height, arcWidth, arcHeight;

    public Lesson25_RoundRectangle() {
        point = new Lesson25_Point();
    }

    public Lesson25_RoundRectangle(double x, double y, double width, double height, double arcWidth, double arcHeight) {
        point = new Lesson25_Point(x, y);
        this.width = width;
        this.height = height;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    @Override
    public double getArcWidth() {
        return arcWidth;
    }

    @Override
    public double getArcHeight() {
        return arcHeight;
    }

    @Override
    public void setRoundRect(double x, double y, double w, double h, double arcWidth, double arcHeight) {
        point.setLocation(x, y);
        width = w;
        height = h;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
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

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
