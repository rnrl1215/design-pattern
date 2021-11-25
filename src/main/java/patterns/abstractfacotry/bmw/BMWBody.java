package patterns.abstractfacotry.bmw;

import patterns.abstractfacotry.car.Body;

public class BMWBody implements Body {
    @Override
    public void info() {
        System.out.println("BMW 바디");
    }
}
