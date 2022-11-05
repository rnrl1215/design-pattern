package study.patterns.factorymethod.coffee;

public class Cappuccino extends Coffee {
    private int price = 4500;

    @Override
    void boilWater() {
        System.out.println("물을 끓인다.");
    }

    @Override
    public void brew() {
        System.out.println("커피를 내린다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("우유 + 우유 거품+ 시나몬가루를 추가한다.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
