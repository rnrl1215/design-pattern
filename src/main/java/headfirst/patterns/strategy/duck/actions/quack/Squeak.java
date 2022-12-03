package headfirst.patterns.strategy.duck.actions.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
