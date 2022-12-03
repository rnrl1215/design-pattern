package headfirst.patterns.strategy.duck.actions.duck;

import headfirst.patterns.strategy.duck.actions.fly.FlyWithWings;
import headfirst.patterns.strategy.duck.actions.quack.Quak;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quak();
    }

    @Override
    public void performQuack() {
        super.performQuack();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        System.out.println("test");
    }

    @Override
    public void performFly() {
        super.performFly();
    }
}
