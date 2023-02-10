package ConcreateAbilities;

import BaseInterfaces.IFlyable;

public class FlyWithWings implements IFlyable {
    @Override
    public void fly() {
        System.out.println("All ducks with this ability can fly with their wings.");
    }
}
