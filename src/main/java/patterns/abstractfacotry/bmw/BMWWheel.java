package patterns.abstractfacotry.bmw;

import patterns.abstractfacotry.car.Wheel;

public class BMWWheel implements Wheel {
    @Override
    public void info() {
        System.out.println("BMW 바퀴");
    }
}
