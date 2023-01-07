package headfirst.patterns.factory;

public abstract class PizzaStore {

    public Pizza Order(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.getName();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(PizzaType type);
}
