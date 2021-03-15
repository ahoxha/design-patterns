package org.hoxha.adapter.legacycode;

class OldRectangleImpl implements OldRectangle {
    private double upperLeftX;
    private double upperLeftY;
    private double width;
    private double height;

    OldRectangleImpl(double upperLeftX, double upperLeftY, double width, double height) {
        this.upperLeftX = upperLeftX;
        this.upperLeftY = upperLeftY;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getUpperLeftXCoordinate() {
        return this.upperLeftX;
    }

    @Override
    public double getUpperLeftYCoordinate() {
        return this.upperLeftY;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }
}
