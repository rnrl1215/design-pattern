package patterns.abstractfacotry.bmw;

import patterns.abstractfacotry.car.Engine;

public class BMWEngine implements Engine {
    @Override
    public void info() {
        System.out.println("BMW 엔진");
    }
}
