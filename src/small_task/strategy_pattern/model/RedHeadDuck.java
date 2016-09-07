package small_task.strategy_pattern.model;

import small_task.strategy_pattern.behavior.fly.FlyWithWings;
import small_task.strategy_pattern.behavior.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
