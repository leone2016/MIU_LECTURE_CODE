package SWE.lesson5.solid_principles._3_liskov_sustitution.bad_design.rectsqrapp1;

// Bad Example: Violating Liskov Substitution Principle
// (the Square-Rectangle Problem)
public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
