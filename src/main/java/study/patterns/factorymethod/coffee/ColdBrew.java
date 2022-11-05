package study.patterns.factorymethod.coffee;

public class ColdBrew extends Coffee {

    private int price = 5000;

    @Override
    void boilWater() {
        System.out.println("물을 끓이지 않는다.");
    }

    @Override
    public void brew() {
        System.out.println("찬물을 한방울씩 떨어뜨려 커피를 내린다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("따로 추가 하지 않는다.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
