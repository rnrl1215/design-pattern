package headfirst.patterns.strategy.duck.actions.quack;

public class Quak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
