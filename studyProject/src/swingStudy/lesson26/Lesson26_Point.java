package swingStudy.lesson26;

import java.awt.geom.Point2D;

//ТОЧКА
public class Lesson26_Point extends Point2D {
    private double x, y;

    public Lesson26_Point() {}

    public Lesson26_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
