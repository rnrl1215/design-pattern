package patterns.templatemethod;


public class DefaultCoffeeMaker extends CoffeeMaker{
    @Override
    protected int boil(String type) {
        int temperature = 100;
        System.out.println("온도: "+ temperature);
        System.out.println(type + "끓이는중");
        return temperature;
    }

    @Override
    protected String selectBean(String beanType) {
        System.out.println("선택된 원두: " + beanType);
        return beanType;
    }

    @Override
    protected String selectCream(String creamType) {
        System.out.println("선택된 크림: " + creamType);
        return creamType;
    }

    @Override
    protected boolean selectIce(boolean isIce) {
        if (isIce) {
            System.out.println("아이스 커피.");
        } else {
            System.out.println("따듯한 커피.");
        }
        return false;
    }
}
