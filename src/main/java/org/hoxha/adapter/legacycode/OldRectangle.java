package org.hoxha.adapter.legacycode;

public interface OldRectangle {
    double getUpperLeftXCoordinate();

    double getUpperLeftYCoordinate();

    double getWidth();

    double getHeight();

    static OldRectangle of(double upperLeftX, double upperLeftY, double width, double height) {
        return new OldRectangleImpl(upperLeftX, upperLeftY, width, height);
    }
}
