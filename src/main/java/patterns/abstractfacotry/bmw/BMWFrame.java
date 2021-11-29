package patterns.abstractfacotry.bmw;

import patterns.abstractfacotry.car.Frame;

public class BMWFrame implements Frame {
    @Override
    public void info() {
        System.out.println("BMW 바디");
    }
}
