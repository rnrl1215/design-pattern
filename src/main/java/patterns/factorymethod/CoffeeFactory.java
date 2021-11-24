package patterns.factorymethod;

import patterns.factorymethod.coffee.*;

public abstract class CoffeeFactory {
    abstract Coffee makeCoffee(CoffeeType type);
}
