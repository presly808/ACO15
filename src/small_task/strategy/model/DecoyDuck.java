package small_task.strategy.model;


import small_task.strategy.behavior.fly.FlyNoWay;
import small_task.strategy.behavior.quack.MuteQuack;

// Деревянные утки
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
