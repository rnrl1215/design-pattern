package headfirst.patterns.duck.actions.duck;

import headfirst.patterns.duck.actions.fly.FlyWithWings;
import headfirst.patterns.duck.actions.quack.Quak;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quak();
    }

    @Override
    void performQuack() {
        super.performQuack();
    }

    @Override
    void swim() {
        super.swim();
    }

    @Override
    void display() {
        super.display();
    }

    @Override
    void performFly() {
        super.performFly();
    }
}
