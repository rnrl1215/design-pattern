package study.patterns.abstractfacotry.benz;

import study.patterns.abstractfacotry.car.Frame;

public class BenzFrame implements Frame {
    @Override
    public void info() {
        System.out.println("Benz 바디");
    }
}
