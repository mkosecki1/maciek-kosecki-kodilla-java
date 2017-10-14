package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        Square square = new Square("first square", 3.0);
        ShapeCollector shapeCollector = new ShapeCollector(square);

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1,shapeCollector.showFigures());
    }
    @Test
    public void testRemoveFigure(){
        //given
        Triangle triangle = new Triangle("first triangle", 2.0,3.0);
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.showFigures());
    }
    @Test
    public void testGetFigure(){
        //Given
        Circle circle = new Circle("first circle", 2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.addFigure(circle);

        //When
        Shape result =  shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle,result);
    }
}
