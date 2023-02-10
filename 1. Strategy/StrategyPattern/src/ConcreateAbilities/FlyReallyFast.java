package ConcreateAbilities;

import BaseInterfaces.IFlyable;

public class FlyReallyFast implements IFlyable {
    @Override
    public void fly() {
        System.out.println("This allows ducks to fly 2 times faster.");
    }
}
