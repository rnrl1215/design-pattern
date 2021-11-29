package patterns.abstractfacotry.benz;

import patterns.abstractfacotry.car.Frame;
import patterns.abstractfacotry.car.CarFactory;
import patterns.abstractfacotry.car.Engine;
import patterns.abstractfacotry.car.Wheel;

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
