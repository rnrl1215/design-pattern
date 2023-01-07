package headfirst.patterns.factory;

public class BasePizza {
    PizzaType pizzaType;

    public BasePizza(PizzaType pizzaName) {
        this.pizzaType = pizzaName;
    }
}
