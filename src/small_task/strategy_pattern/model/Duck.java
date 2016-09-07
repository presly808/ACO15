package small_task.strategy_pattern.model;

import small_task.strategy_pattern.behavior.fly.FlyBehavior;
import small_task.strategy_pattern.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    //Для динамического изменения поведения утки
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    //Для динамического изменения поведения утки
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
