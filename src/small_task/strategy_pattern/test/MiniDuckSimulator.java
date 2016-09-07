package small_task.strategy_pattern.test;


import small_task.strategy_pattern.behavior.fly.FlyRocketPowered;
import small_task.strategy_pattern.model.DecoyDuck;
import small_task.strategy_pattern.model.MallardDuck;
import small_task.strategy_pattern.model.ModelDuck;
import small_task.strategy_pattern.model.RubberDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
