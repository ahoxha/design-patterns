package org.hoxha.adapter.newcode;

public class AreaCalculator {
    public double calculateArea(SimpleRectangle rectangle) {
        double width = rectangle.getLowerRightCorner().getX() - rectangle.getUpperLeftCorner().getX();
        double height = rectangle.getLowerRightCorner().getY() - rectangle.getUpperLeftCorner().getY();
        return width*height;
    }
}
