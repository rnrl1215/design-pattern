package patterns.templatemethod;

public abstract class CoffeeMaker {
    protected abstract int boil(String type);
    protected abstract String selectBean(String beanType);
    protected abstract String selectCream(String creamType);
    protected abstract boolean selectIce(boolean isIce);

    // template method
    public void makeCoffee(String type, String beanType, String creamType, boolean isIce) {
        boil(type);
        selectBean(beanType);
        selectCream(creamType);
        selectIce(isIce);
    }
}
