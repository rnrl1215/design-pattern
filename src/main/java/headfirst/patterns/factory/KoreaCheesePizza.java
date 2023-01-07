package headfirst.patterns.factory;

public class KoreaCheesePizza extends Pizza {
    public KoreaCheesePizza() {
        name = "한국 스타일 치즈 피자";
        dough= "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";
        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    @Override
    void cut() {
        System.out.println("사각형으로 자른다.");
    }
}
