package headfirst.patterns.strategy.duck.actions.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
