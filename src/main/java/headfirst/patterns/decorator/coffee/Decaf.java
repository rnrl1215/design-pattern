package headfirst.patterns.decorator.coffee;

public class Decaf extends Beverage {
    public Decaf() {
        description = "decaf";
    }

    public double cost() {
        return 1.05;
    }
}
