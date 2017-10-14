package com.kodilla.testing.shape;

public class Square implements Shape {

    String name;
    double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        // do nothing
    }

    @Override
    public double getField() {
        // return 10 temporarily
        return 10;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
