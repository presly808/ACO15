package small_task.strategy.test;

import small_task.strategy.behavior.fly.FlyRocketPowered;
import small_task.strategy.model.Duck;
import small_task.strategy.model.MallardDuck;
import small_task.strategy.model.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
