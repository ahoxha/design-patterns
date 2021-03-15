package org.hoxha.adapter.newcode;

import org.hoxha.adapter.legacycode.OldRectangle;

public class SimpleRectangleAdapter implements SimpleRectangle {
    private final Point upperLeftCorner;
    private final Point lowerRightCorner;

    public SimpleRectangleAdapter(OldRectangle oldRectangle) {
        upperLeftCorner = new PointImpl(oldRectangle.getUpperLeftXCoordinate(), oldRectangle.getUpperLeftYCoordinate());
        lowerRightCorner = new PointImpl(oldRectangle.getUpperLeftXCoordinate() + oldRectangle.getWidth(), oldRectangle.getUpperLeftYCoordinate() + oldRectangle.getHeight());
    }

    @Override
    public Point getUpperLeftCorner() {
        return upperLeftCorner;
    }

    @Override
    public Point getLowerRightCorner() {
        return lowerRightCorner;
    }
}

