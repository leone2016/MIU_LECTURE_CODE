package SWE.lesson5.solid_principles._3_liskov_sustitution.bad_design.rectsqrapp1;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    // This violates LSP because setting width or height separately
    // changes the fundamental behavior (maintaining equal sides) of
    // a Square.
    // If you substitute a Square for a Rectangle, the caller's
    // expectation
    // that width and height can be set independently is broken.
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width; // Enforce square property
    }

    @Override
    public void setHeight(double height) {
        this.width = height; // Enforce square property
        this.height = height;
    }
}
