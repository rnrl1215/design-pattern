package headfirst.patterns.decorator;

import headfirst.patterns.decorator.coffee.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize().equals(Size.TALL)) {
            cost += 0.10;
        } else if (beverage.getSize().equals(Size.GRANDE)) {
            cost += 0.15;
        } else if (beverage.getSize().equals(Size.VENTI)) {
            cost += 0.20;
        }
        return cost;
        //return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }
}
