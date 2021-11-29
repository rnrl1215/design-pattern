package patterns.abstractfacotry.benz;

import patterns.abstractfacotry.car.Frame;

public class BenzFrame implements Frame {
    @Override
    public void info() {
        System.out.println("Benz 바디");
    }
}
