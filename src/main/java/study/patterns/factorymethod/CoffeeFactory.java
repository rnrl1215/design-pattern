package study.patterns.factorymethod;

import study.patterns.factorymethod.coffee.Coffee;
import study.patterns.factorymethod.coffee.CoffeeType;

public abstract class CoffeeFactory {
    abstract Coffee makeCoffee(CoffeeType type);
}
