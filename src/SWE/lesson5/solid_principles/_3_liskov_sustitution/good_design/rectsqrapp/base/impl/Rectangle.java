package SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.impl;

import SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.Shape;

public class Rectangle implements Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Setters are fine here as they don't violate
    // an invariant for Rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
