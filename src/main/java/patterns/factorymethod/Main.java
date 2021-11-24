package patterns.factorymethod;

import patterns.factorymethod.coffee.Coffee;
import patterns.factorymethod.coffee.CoffeeType;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Coffee latte = coffeeMachine.makeCoffee(CoffeeType.LATTE);
        latte.makeCoffee();
        System.out.println("커피가격: "+latte.getPrice());

        System.out.println("  ");

        Coffee coldBrew = coffeeMachine.makeCoffee(CoffeeType.COLDEBREW);
        coldBrew.makeCoffee();
        System.out.println("커피가격: "+coldBrew.getPrice());
    }
}
