package patterns.factorymethod.coffee;

public class Lattee extends Coffee {

    private int price = 4300;

    @Override
    void boilWater() {
        super.boilWater();
    }

    @Override
    public void brew() {
        System.out.println("커피를 내린다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("우유를 넣는다.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
