package headfirst.patterns.strategy.duck.actions.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
