package headfirst.patterns.factory;

public class KoreaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new KoreaCheesePizza();
        } else {
        return null;
        }
    }
}
