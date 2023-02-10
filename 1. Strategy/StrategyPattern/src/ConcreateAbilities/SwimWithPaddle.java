package ConcreateAbilities;

import BaseInterfaces.ISwimmable;

public class SwimWithPaddle implements ISwimmable {
    @Override
    public void swim() {
        System.out.println("Swimming with paddles");
    }
}
