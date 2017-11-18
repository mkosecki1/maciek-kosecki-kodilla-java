package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCircle(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Thenn
        Assert.assertEquals(Math.PI * Math.pow(4.5,2.0),circle.getField(),0);
        Assert.assertEquals("The rounded circle",circle.getName());
        Assert.assertEquals(2 * Math.PI * 4.5, circle.getCircumference(),0);
    }
    @Test
    public void testFactorySquare(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(Math.pow(7.0,2.0),square.getField(),0);
        Assert.assertEquals(28.0,square.getCircumference(),0);
        Assert.assertEquals("The angular square",square.getName());
    }
    @Test
    public void testFactoryRectangle(){
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(15.0 * 2.5,rectangle.getField(),0);
        Assert.assertEquals(2 * 15.0 + 2 * 2.5,rectangle.getCircumference(),0);
        Assert.assertEquals("The long rectangle",rectangle.getName());
    }
}
