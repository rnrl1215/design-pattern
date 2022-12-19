package headfirst.patterns.decorator.coffee;

import lombok.Getter;

@Getter
public abstract class Beverage {
    String description = "";
    public enum Size{TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    public void setSize(Size size) {
        this.size = size;
    }


    public abstract double cost();
}
