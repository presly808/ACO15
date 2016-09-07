package small_task.strategy_pattern.model;

import small_task.strategy_pattern.behavior.fly.FlyNoWay;
import small_task.strategy_pattern.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
