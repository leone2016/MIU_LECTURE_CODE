package MPP.assignments.lab5.prob2.duck;

import MPP.assignments.lab5.prob2.flyBehavior.CannotFlyImpl;
import MPP.assignments.lab5.prob2.quackBehavior.SqueakImpl;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFlyImpl();
        quackBehavior = new SqueakImpl();
    }

    public void display() {
        System.out.println("displaying");
    }
}
