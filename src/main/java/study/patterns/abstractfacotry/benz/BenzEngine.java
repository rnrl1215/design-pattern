package study.patterns.abstractfacotry.benz;

import study.patterns.abstractfacotry.car.Engine;

public class BenzEngine implements Engine {
    @Override
    public void info() {
        System.out.println("Benz 엔진");
    }
}
