package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        figures.add(shape);

    }

    public boolean removeFigure(Shape shape){
        figures.remove(shape);
        return true;
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public ArrayList<Shape> showFigures(){
        return figures;
    }

    public Shape getShape() {
        return shape;
    }
}
