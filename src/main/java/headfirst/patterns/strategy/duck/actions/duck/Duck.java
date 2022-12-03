package headfirst.patterns.strategy.duck.actions.duck;

import headfirst.patterns.strategy.duck.actions.fly.FlyBehavior;
import headfirst.patterns.strategy.duck.actions.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

   public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
