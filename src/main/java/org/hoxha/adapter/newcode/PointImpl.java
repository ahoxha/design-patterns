package org.hoxha.adapter.newcode;

public class PointImpl implements Point {
    private final double x;
    private final double y;

    public PointImpl(double x, double y) {
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
    public String toString() {
        return "[x: " + getX() + ", y:" + getY() + "]";
    }
}
