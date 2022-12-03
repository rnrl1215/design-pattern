package study.patterns.abstractfacotry.benz;

import study.patterns.abstractfacotry.car.CarFactory;
import study.patterns.abstractfacotry.car.Engine;
import study.patterns.abstractfacotry.car.Frame;
import study.patterns.abstractfacotry.car.Wheel;

public class BenzFactory implements CarFactory {
    @Override
    public Frame createFrame() {
        return new BenzFrame();
    }

    @Override
    public Wheel createWheel() {
        return new BenzWheel();
    }

    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }
}
