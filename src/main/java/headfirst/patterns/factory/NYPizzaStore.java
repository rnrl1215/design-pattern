package headfirst.patterns.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new NYCheesePizza();
        } else {
            return null;
        }
    }
}
