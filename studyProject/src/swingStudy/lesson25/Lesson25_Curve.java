package swingStudy.lesson25;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

// КРИВАЯ
public class Lesson25_Curve extends CubicCurve2D { // ИЛИ extends QuadCurve
    @Override
    public double getX1() {
        return 0;
    }

    @Override
    public double getY1() {
        return 0;
    }

    @Override
    public Point2D getP1() {
        return null;
    }

    @Override
    public double getCtrlX1() {
        return 0;
    }

    @Override
    public double getCtrlY1() {
        return 0;
    }

    @Override
    public Point2D getCtrlP1() {
        return null;
    }

    @Override
    public double getCtrlX2() {
        return 0;
    }

    @Override
    public double getCtrlY2() {
        return 0;
    }

    @Override
    public Point2D getCtrlP2() {
        return null;
    }

    @Override
    public double getX2() {
        return 0;
    }

    @Override
    public double getY2() {
        return 0;
    }

    @Override
    public Point2D getP2() {
        return null;
    }

    @Override
    public void setCurve(double x1, double y1, double ctrlx1, double ctrly1, double ctrlx2, double ctrly2, double x2, double y2) {

    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
