package study.patterns.abstractfacotry.bmw;

import study.patterns.abstractfacotry.car.Frame;
import study.patterns.abstractfacotry.car.CarFactory;
import study.patterns.abstractfacotry.car.Engine;
import study.patterns.abstractfacotry.car.Wheel;

public class BMWFactory implements CarFactory {
    @Override
    public Frame createFrame() {
        return new BMWFrame();
    }

    @Override
    public Wheel createWheel() {
        return new BMWWheel();
    }

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }
}
