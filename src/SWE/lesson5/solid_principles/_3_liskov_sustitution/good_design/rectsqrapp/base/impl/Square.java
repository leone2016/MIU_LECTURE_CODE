package SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.impl;

import SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.Shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Square does not expose separate setters for width and height,
    // thereby avoiding the LSP violation. Its invariant (sides are equal) is maintained.
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
