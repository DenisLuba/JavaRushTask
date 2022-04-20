package swingStudy.lesson25;

import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

// ДУГА
public class Lesson25_Arc extends Arc2D {
    @Override
    public double getAngleStart() {
        return 0;
    }

    @Override
    public double getAngleExtent() {
        return 0;
    }

    @Override
    public void setArc(double x, double y, double w, double h, double angSt, double angExt, int closure) {

    }

    @Override
    public void setAngleStart(double angSt) {

    }

    @Override
    public void setAngleExtent(double angExt) {

    }

    @Override
    protected Rectangle2D makeBounds(double x, double y, double w, double h) {
        return null;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
