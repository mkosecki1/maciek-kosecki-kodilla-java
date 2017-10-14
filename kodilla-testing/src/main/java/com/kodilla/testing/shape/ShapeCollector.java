package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        // do nothing

    }

    public boolean removeFigure(Shape shape){
        // return true temporarily
        return true;
    }

    public Shape getFigure(int n){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ArrayList<Shape> showFigures(){
        // do nothing
    }

    public Shape getShape() {
        return shape;
    }
}
