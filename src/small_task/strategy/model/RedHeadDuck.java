package small_task.strategy.model;


import small_task.strategy.behavior.fly.FlyWithWings;
import small_task.strategy.behavior.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
