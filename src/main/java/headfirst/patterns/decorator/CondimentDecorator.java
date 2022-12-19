package headfirst.patterns.decorator;

import headfirst.patterns.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
