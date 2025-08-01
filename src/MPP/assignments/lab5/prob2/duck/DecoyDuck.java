package MPP.assignments.lab5.prob2.duck;

import MPP.assignments.lab5.prob2.flyBehavior.CannotFlyImpl;
import MPP.assignments.lab5.prob2.quackBehavior.MuteQuackImpl;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new CannotFlyImpl();
        quackBehavior = new MuteQuackImpl();
    }

    public void display() {
        System.out.println("displaying");
    }
}
