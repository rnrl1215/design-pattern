package study.patterns.abstractfacotry.benz;

import study.patterns.abstractfacotry.car.Wheel;

public class BenzWheel implements Wheel {
    @Override
    public void info() {
        System.out.println("Benz 바퀴");
    }
}
