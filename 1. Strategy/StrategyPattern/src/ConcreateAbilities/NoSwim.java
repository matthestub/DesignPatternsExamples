package ConcreateAbilities;

import BaseInterfaces.ISwimmable;

public class NoSwim implements ISwimmable {
    @Override
    public void swim() {
        System.out.println("I can't swim.");
    }
}
