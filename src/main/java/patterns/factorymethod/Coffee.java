package patterns.factorymethod;

public abstract class Coffee {
    final void makeCoffee() {
        boilWater();
        brew();
        addCondiments();
    }

    void boilWater() {
        System.out.println("물을 끓인다.");
    }

    abstract void brew();
    abstract void addCondiments();

}
