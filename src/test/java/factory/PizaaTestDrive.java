package factory;

import headfirst.patterns.factory.KoreaPizzaStore;
import headfirst.patterns.factory.NYPizzaStore;
import headfirst.patterns.factory.Pizza;
import headfirst.patterns.factory.PizzaType;
import headfirst.patterns.strategy.duck.actions.duck.Duck;
import headfirst.patterns.strategy.duck.actions.duck.MallardDuck;
import headfirst.patterns.strategy.duck.actions.duck.ModelDuck;
import headfirst.patterns.strategy.duck.actions.fly.FlyRocketPowered;
import org.junit.jupiter.api.Test;


public class PizaaTestDrive {
    @Test
    public void  test() {
        KoreaPizzaStore koreaPizzaStore = new KoreaPizzaStore();
        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza order = koreaPizzaStore.Order(PizzaType.CHEESE);
        Pizza order1 = nyPizzaStore.Order(PizzaType.CHEESE);
    }
}
