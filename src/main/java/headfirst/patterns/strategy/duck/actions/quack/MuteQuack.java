package headfirst.patterns.strategy.duck.actions.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("조용");
    }
}
