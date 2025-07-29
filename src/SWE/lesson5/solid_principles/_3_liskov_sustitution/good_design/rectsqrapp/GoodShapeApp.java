package SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp;


import SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.Shape;
import SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.impl.Rectangle;
import SWE.lesson5.solid_principles._3_liskov_sustitution.good_design.rectsqrapp.base.impl.Square;

public class GoodShapeApp {

    public static void printShapeArea(Shape shape) {
        // We can only call getArea(), which is a common and
        // safe operation for all shapes
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        printShapeArea(rect); // Area: 20.0

        Square square = new Square(5);
        printShapeArea(square); // Area: 25.0

        // The printShapeArea method can accept both Rectangle and
        // Square
        // objects interchangeably because they both adhere to the
        // Shape interface's contract,
        // and their individual behaviors do not contradict each
        // other when used polymorphically.
        // We avoid methods that would cause behavioral mismatches
        // in the hierarchy.
    }
}
