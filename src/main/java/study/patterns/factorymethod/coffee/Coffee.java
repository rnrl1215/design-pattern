package study.patterns.factorymethod.coffee;

public abstract class Coffee {

    public void makeCoffee() {
        boilWater();
        brew();
        addCondiments();
        System.out.println("커피제조완료");
    }

    void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public abstract void brew();
    public abstract void addCondiments();
    public abstract int getPrice();
}
