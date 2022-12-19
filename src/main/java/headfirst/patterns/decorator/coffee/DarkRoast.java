package headfirst.patterns.decorator.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "dark roast";
    }

    public double cost() {
        return 0.99;
    }
}
