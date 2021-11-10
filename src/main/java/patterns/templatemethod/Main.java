package patterns.templatemethod;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new DefaultCoffeeMaker();
        coffeeMaker.makeCoffee("물","에티오피아"," 없음",true);
    }
}
