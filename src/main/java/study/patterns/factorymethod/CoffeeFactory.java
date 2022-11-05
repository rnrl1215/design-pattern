package study.patterns.factorymethod;

import study.patterns.factorymethod.coffee.*;

public abstract class CoffeeFactory {
    abstract Coffee makeCoffee(CoffeeType type);
}
