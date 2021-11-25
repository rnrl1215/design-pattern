package patterns.abstractfacotry.benz;

import patterns.abstractfacotry.car.Body;

public class BenzBody implements Body {
    @Override
    public void info() {
        System.out.println("Benz 바디");
    }
}
