package small_task.strategy_pattern.behavior.fly;

// Не умеет летать
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
