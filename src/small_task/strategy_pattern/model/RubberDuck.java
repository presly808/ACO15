package small_task.strategy_pattern.model;

import small_task.strategy_pattern.behavior.fly.FlyNoWay;
import small_task.strategy_pattern.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
