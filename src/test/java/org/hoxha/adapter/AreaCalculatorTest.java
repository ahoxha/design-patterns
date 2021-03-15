package org.hoxha.adapter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.hoxha.adapter.legacycode.OldRectangle;
import org.hoxha.adapter.newcode.AreaCalculator;
import org.hoxha.adapter.newcode.SimpleRectangle;
import org.hoxha.adapter.newcode.SimpleRectangleAdapter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AreaCalculatorTest {
    private final AreaCalculator sut = new AreaCalculator();

    @ParameterizedTest(name = "Given a rectangle with width {2} and height {3} its surface area should be {4}")
    @MethodSource("getInputArguments")
    void testCalculateArea(double upperLeftX, double upperLeftY, double width, double height, double surfaceArea) {
        OldRectangle rect = OldRectangle.of(upperLeftX, upperLeftY, width, height);
        SimpleRectangle simpleRectangleAdapter = new SimpleRectangleAdapter(rect);

        double area = sut.calculateArea(simpleRectangleAdapter);

        assertThat(area).isEqualTo(surfaceArea);
    }

    static Stream<Arguments> getInputArguments() {
        return Stream.of( //
                of(3, 3, 8, 3, 24), //
                of(0, 0, 0, 0, 0), //
                of(0, 0, 5, 5, 25), //
                of(-4, -12, 4, 5, 20));
    }
}
