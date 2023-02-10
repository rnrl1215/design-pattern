package headfirst.patterns.decorator;

import headfirst.patterns.decorator.coffee.Beverage;
import headfirst.patterns.decorator.coffee.DarkRoast;
import headfirst.patterns.decorator.coffee.Espresso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTest {



    @Test
    void test() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        Assertions.assertEquals(beverage2.cost(),1.49);

    }
}
