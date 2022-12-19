package headfirst.patterns.decorator.coffee;

import lombok.Getter;

@Getter
public abstract class Beverage {
    String description = "";
    public abstract double cost();
}
