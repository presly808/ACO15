package small_task.strategy.model;


import small_task.strategy.behavior.fly.FlyWithWings;
import small_task.strategy.behavior.quack.Quack;

// Кряквы
public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();


    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
