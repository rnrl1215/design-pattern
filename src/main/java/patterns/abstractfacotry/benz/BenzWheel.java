package patterns.abstractfacotry.benz;

import patterns.abstractfacotry.car.Wheel;

public class BenzWheel implements Wheel {
    @Override
    public void info() {
        System.out.println("Benz 바퀴");
    }
}
