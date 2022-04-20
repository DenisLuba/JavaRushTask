package swingStudy.lesson24;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Lesson24_Line extends Line2D {
    private Lesson24_Point p1;
    private Lesson24_Point p2;



    public Lesson24_Line() {
        p1 = new Lesson24_Point();
        p2 = new Lesson24_Point();
    }

    public Lesson24_Line(double x1, double y1, double x2, double y2) {
        p1 = new Lesson24_Point(x1, y1);
        p2 = new Lesson24_Point(x2, y2);
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
}
