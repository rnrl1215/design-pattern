package headfirst.patterns.strategy.duck.actions.duck;

import headfirst.patterns.strategy.duck.actions.fly.FlyNoWay;
import headfirst.patterns.strategy.duck.actions.quack.Quak;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quak();
    }

    @Override
    public void display() {
        System.out.println("모형 오리");
    }


}
