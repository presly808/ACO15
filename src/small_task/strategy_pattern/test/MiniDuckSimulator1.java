package small_task.strategy_pattern.test;

import small_task.strategy_pattern.behavior.fly.FlyRocketPowered;
import small_task.strategy_pattern.model.Duck;
import small_task.strategy_pattern.model.MallardDuck;
import small_task.strategy_pattern.model.ModelDuck;

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
