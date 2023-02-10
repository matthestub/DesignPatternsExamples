import ConcreateAbilities.*;
import ConcreateDucks.RedDuck;
import ConcreateDucks.RubberDuck;
import ConcreateDucks.WildDuck;

public class Main {

    public static void main(String[] args) {

        RedDuck redDuck = new RedDuck(new FlyReallyFast(), new SwimReallyFast());
        WildDuck wildDuck = new WildDuck(new FlyWithWings(), new SwimWithPaddle());
        RubberDuck rubberDuck = new RubberDuck(new NoFly(), new NoSwim());

        redDuck.display();
        redDuck.fly();
        redDuck.swim();

        wildDuck.display();
        wildDuck.fly();
        wildDuck.swim();

        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.swim();

    }

}
