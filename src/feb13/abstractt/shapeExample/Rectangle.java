package feb13.abstractt.shapeExample;

import feb13.abstractt.shapeExample.Shape;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Color of rectangle is "+super.getColor() + " and Area is "+area();
    }
}
