package study.patterns.abstractfacotry.bmw;

import study.patterns.abstractfacotry.car.Frame;

public class BMWFrame implements Frame {
    @Override
    public void info() {
        System.out.println("BMW 바디");
    }
}
