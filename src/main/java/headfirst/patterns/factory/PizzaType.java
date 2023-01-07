package headfirst.patterns.factory;

public enum PizzaType {
    GREEK("Greek"), CHEESE("Cheese");
    final String value;
    PizzaType(String value) {
        this.value = value;
    }
}
