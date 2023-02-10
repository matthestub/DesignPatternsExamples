package ConcreateDucks;

import BaseInterfaces.Duck;
import BaseInterfaces.IFlyable;
import BaseInterfaces.ISwimmable;

public class RedDuck extends Duck {

    IFlyable flyable;
    ISwimmable swimmable;

    public RedDuck(IFlyable flyable, ISwimmable swimmable) {
        this.flyable = flyable;
        this.swimmable = swimmable;
    }

    @Override
    public void fly() {
        flyable.fly();
    }

    @Override
    public void swim() {
        swimmable.swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Duck.");
    }
}
