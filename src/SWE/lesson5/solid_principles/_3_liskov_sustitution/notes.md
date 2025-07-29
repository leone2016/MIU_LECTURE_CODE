Explanation of LSP Violation:

The printArea method expects a Rectangle. When setWidth(5) and setHeight(4) are called on a Rectangle object, it's expected that the width becomes 5 and the height becomes 4, resulting in an area of 20.

However, when a Square object (which is a Rectangle by inheritance) is passed to printArea:

square.setWidth(5) is called. Due to Square's overridden method, height also becomes 5.

square.setHeight(4) is called. Due to Square's overridden method, width also becomes 4.

The final state of the Square is width = 4, height = 4, leading to an area of 16.

This is a violation of LSP because substituting Square for Rectangle changed the expected behavior of the printArea method. The client (printArea) assumes it can manipulate width and height independently, which is true for Rectangle but not for Square.

Adhering to LSP (Good Example)
To adhere to LSP in the shape example, we should reconsider the inheritance hierarchy. A Square is not truly a Rectangle in terms of behavior if Rectangle allows independent manipulation of width and height.

A better approach is to define a common interface or abstract base class that represents a Shape that can calculate its area, but without methods that would violate the Square's invariant. Or, if Rectangle has setters, Square should not inherit from Rectangle in this way.

Here are a few ways to fix this, depending on the context:

Option 1: Common Interface (Preferred for LSP)

If the primary use case is calculating area, an interface is a good choice.

The Liskov Substitution Principle (LSP) is the third of the five SOLID principles of object-oriented design, introduced by Barbara Liskov in 1987. It states:

"Subtypes must be substitutable for their base types without altering the correctness of the program."

In simpler terms, if you have a base class (or interface) and a subclass (or implementation), you should be able to use an object of the subclass wherever an object of the base class is expected, and the program should still behave as expected, without errors or unexpected results. The derived class should extend the capabilities of the base class without changing its fundamental behavior or violating its contract.

Key Aspects of LSP
Behavioral Subtyping: LSP is about behavioral subtyping, not just structural subtyping (i.e., having the same methods). A subclass might have the same method signatures as its superclass, but if its implementation behaves unexpectedly when substituted for the superclass, it violates LSP.

No Violation of Pre-conditions: A subclass should not strengthen the pre-conditions of a method it overrides. This means it should not require more from the caller than the base class method does.

No Violation of Post-conditions: A subclass should not weaken the post-conditions of a method it overrides. This means it should not provide less guarantee to the caller than the base class method does.

Invariant Preservation: Invariants (conditions that always hold true for an object) of the base class must be preserved in the subclass.

No New Exceptions: A subclass should not throw new, unexpected exceptions that are not part of the base class's method contract (unless those exceptions are more specific types of exceptions already declared by the base class).

Why is LSP Important?
Robustness and Correctness: Adhering to LSP ensures that your inheritance hierarchies are well-designed and that substituting subclasses won't break your code, leading to more robust and correct systems.

Maintainability and Extensibility: It allows you to add new subclasses without having to modify existing client code that uses the base type. This promotes open/closed principle as well.

Predictable Behavior: When LSP is followed, the behavior of your program remains predictable regardless of which specific subclass instance you are working with.

Polymorphism at its Best: LSP is crucial for effective polymorphism. It ensures that polymorphism genuinely works as intended, where different types can be treated uniformly through a common interface.

Violating LSP (Bad Example)
A classic example of LSP violation often involves geometric shapes, particularly the Square-Rectangle problem.

Java

// Bad Example: Violating Liskov Substitution Principle (Square-Rectangle Problem)

class Rectangle {
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

class Square extends Rectangle {
public Square(double side) {
super(side, side);
}

    // This violates LSP because setting width or height separately
    // changes the fundamental behavior (maintaining equal sides) of a Square.
    // If you substitute a Square for a Rectangle, the caller's expectation
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

public class BadShapeExample {
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
        printArea(square); // Expected: 20, Actual: 16 (or 25 depending on order of set)
                           // The behavior is unexpected when a Square is substituted for a Rectangle.
    }
}
Explanation of LSP Violation:

The printArea method expects a Rectangle. When setWidth(5) and setHeight(4) are called on a Rectangle object, it's expected that the width becomes 5 and the height becomes 4, resulting in an area of 20.

However, when a Square object (which is a Rectangle by inheritance) is passed to printArea:

square.setWidth(5) is called. Due to Square's overridden method, height also becomes 5.

square.setHeight(4) is called. Due to Square's overridden method, width also becomes 4.

The final state of the Square is width = 4, height = 4, leading to an area of 16.

This is a violation of LSP because substituting Square for Rectangle changed the expected behavior of the printArea method. The client (printArea) assumes it can manipulate width and height independently, which is true for Rectangle but not for Square.

Adhering to LSP (Good Example)
To adhere to LSP in the shape example, we should reconsider the inheritance hierarchy. A Square is not truly a Rectangle in terms of behavior if Rectangle allows independent manipulation of width and height.

A better approach is to define a common interface or abstract base class that represents a Shape that can calculate its area, but without methods that would violate the Square's invariant. Or, if Rectangle has setters, Square should not inherit from Rectangle in this way.

Here are a few ways to fix this, depending on the context:

Option 1: Common Interface (Preferred for LSP)

If the primary use case is calculating area, an interface is a good choice.

In the improved example:

- We introduce a common Shape interface with getArea().

- Rectangle and Square both implement Shape.

- Square manages its side independently and does not inherit setWidth or setHeight from a Rectangle base class that would force a behavioral conflict.

- The printShapeArea method operates on the Shape interface, only calling getArea(), which is a safe and consistent operation for all shapes.

This design respects LSP because you can substitute Rectangle or Square where a Shape is expected, and the getArea() method will always return the correct area without unexpected side effects due to internal state manipulation that conflicts with the base type's assumed behavior.

Option 2: Make Rectangle abstract and remove setters if they cause issues for subclasses. (Less common, but valid for some scenarios where setters are inherently problematic for derived types).

The core idea is to design your class hierarchies so that derived classes truly extend the base class's behavior without contradicting or breaking the expectations clients have of the base class. If a subclass cannot genuinely fulfill the contract of its superclass, then inheritance is likely the wrong relationship.