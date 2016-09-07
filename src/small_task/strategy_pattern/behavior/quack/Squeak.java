package small_task.strategy_pattern.behavior.quack;

// Пищит
public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
