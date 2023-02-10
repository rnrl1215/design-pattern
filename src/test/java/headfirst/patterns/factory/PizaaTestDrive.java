package headfirst.patterns.factory;

import org.junit.jupiter.api.Test;


public class PizaaTestDrive {
    @Test
    public void  test() {
        KoreaPizzaStore koreaPizzaStore = new KoreaPizzaStore();
        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza order = koreaPizzaStore.Order(PizzaType.CHEESE);
        Pizza order1 = nyPizzaStore.Order(PizzaType.CHEESE);
    }
}
