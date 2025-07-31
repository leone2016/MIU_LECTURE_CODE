package MPP.assignments.lab5.prob2.duck;

import MPP.assignments.lab5.prob2.flyBehavior.FlyWithWingsImpl;
import MPP.assignments.lab5.prob2.quackBehavior.QuackImpl;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWingsImpl();
        quackBehavior = new QuackImpl();
    }

    public void display() {
        System.out.println("displaying");
    }
}

