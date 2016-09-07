package small_task.strategy_pattern.behavior.quack;

// Молчит
public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
