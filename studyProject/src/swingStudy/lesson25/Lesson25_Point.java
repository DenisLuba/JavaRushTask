package swingStudy.lesson25;

import java.awt.geom.Point2D;

//ТОЧКА
public class Lesson25_Point extends Point2D {
    private double x, y;

    public Lesson25_Point() {}

    public Lesson25_Point(double x, double y) {
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
