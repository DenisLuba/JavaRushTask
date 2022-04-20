package swingStudy.lesson26;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Lesson26_Line extends Line2D {
    private Lesson26_Point p1;
    private Lesson26_Point p2;

    private double x0;
    private double y0;

    private double r = 100.0;
    private double angle = 1;
    private double i = 0;

    public Lesson26_Line() {
        p1 = new Lesson26_Point();
        p2 = new Lesson26_Point();
        x0 = p2.getX();
        y0 = p2.getY();
    }

    public Lesson26_Line(double x1, double y1, double x2, double y2) {
        p1 = new Lesson26_Point(x1, y1);
        p2 = new Lesson26_Point(x2, y2);
        x0 = p1.getX();
        y0 = p1.getY();
    }

    @Override
    public double getX1() {
        return p1.getX();
    }

    @Override
    public double getY1() {
        return p1.getY();
    }

    @Override
    public Point2D getP1() {
        return p1;
    }

    @Override
    public double getX2() {
        return p2.getX();
    }

    @Override
    public double getY2() {
        return p2.getY();
    }

    @Override
    public Point2D getP2() {
        return p2;
    }

    @Override
    public void setLine(double x1, double y1, double x2, double y2) {
        p1.setLocation(x1, y1);
        p2.setLocation(x2, y2);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    // одномоментное движение
    public void movie() {
        if (i * angle > 360) i = 0;
        else i+= 0.05;
        double newX = p2.getX() + r * Math.cos(i * angle);
        double newY = p2.getY() + r * Math.sin(i * angle);

        this.setLine(newX, newY, p2.getX(), p2.getY());
    }
}
