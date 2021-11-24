package patterns.factorymethod;

import patterns.factorymethod.coffee.*;

public class CoffeeMachine extends CoffeeFactory {
    @Override
    Coffee makeCoffee(CoffeeType type) {
        Coffee coffee;
        switch (type) {
            case LATTE:
                return new Lattee();
            case COLDEBREW:
                return new ColdBrew();
            case CAPPUCCINO:
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("지원하지 않는 메뉴입니다.");
        }
    }
}