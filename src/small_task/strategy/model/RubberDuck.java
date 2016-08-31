package small_task.strategy.model;


import small_task.strategy.behavior.fly.FlyNoWay;
import small_task.strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
