package ConcreateAbilities;

import BaseInterfaces.ISwimmable;

public class SwimReallyFast implements ISwimmable {
    @Override
    public void swim() {
        System.out.println("This allows ducks to swim 2 times faster.");
    }
}
