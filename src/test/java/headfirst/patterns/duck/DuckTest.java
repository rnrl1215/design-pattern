package headfirst.patterns.duck;

import headfirst.patterns.strategy.duck.actions.duck.Duck;
import headfirst.patterns.strategy.duck.actions.duck.MallardDuck;
import headfirst.patterns.strategy.duck.actions.duck.ModelDuck;
import headfirst.patterns.strategy.duck.actions.fly.FlyRocketPowered;
import org.junit.jupiter.api.Test;



public class DuckTest {
    @Test
    public void  test() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        // 전략 패턴으로 필요한 의존성 주입
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
