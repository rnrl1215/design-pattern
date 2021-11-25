package patterns.abstractfacotry.benz;

import patterns.abstractfacotry.car.Engine;

public class BenzEngine implements Engine {
    @Override
    public void info() {
        System.out.println("Benz 엔진");
    }
}
