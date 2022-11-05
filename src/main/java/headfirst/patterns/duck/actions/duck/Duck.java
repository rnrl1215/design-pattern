package headfirst.patterns.duck.actions.duck;

import headfirst.patterns.duck.actions.fly.FlyBehavior;
import headfirst.patterns.duck.actions.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performQuack() {
        quackBehavior.quack();
    }
    void swim() {
        System.out.println("swim!");
    }
    void display(){

    }
    void performFly(){
        flyBehavior.fly();
    }
}
