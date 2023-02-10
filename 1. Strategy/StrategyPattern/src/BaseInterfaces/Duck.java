package BaseInterfaces;

public abstract class Duck {

    void quack() {
        System.out.println("Quack, quack - all ducks quack in the same way.");
    }

    public abstract void display();
    public abstract void fly();
    public abstract void swim();


}
