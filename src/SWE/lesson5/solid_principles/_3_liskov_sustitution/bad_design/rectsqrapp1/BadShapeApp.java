package SWE.lesson5.solid_principles._3_liskov_sustitution.bad_design.rectsqrapp1;

public class BadShapeApp {
    public static void printArea(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Expected area: 20");
        System.out.println("Actual area: " + r.getArea());
    }

    public static void main(String[] args) {
        System.out.println("--- Using Rectangle ---");
        Rectangle rect = new Rectangle(2, 3);
        printArea(rect); // Expected: 20, Actual: 20

        System.out.println("\n--- Using Square (LSP violation) ---");
        Square square = new Square(3);
        printArea(square); // Expected: 20, Actual: 16
        // (or 25 depending on order of the setter method calls)
        // The behavior is unexpected when a Square is substituted
        // for a Rectangle.
    }
}
