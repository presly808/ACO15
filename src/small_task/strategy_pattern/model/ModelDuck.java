package small_task.strategy_pattern.model;


import small_task.strategy_pattern.behavior.fly.FlyNoWay;
import small_task.strategy_pattern.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
