package patterns.abstractfacotry.bmw;

import patterns.abstractfacotry.car.Body;
import patterns.abstractfacotry.car.CarFactory;
import patterns.abstractfacotry.car.Engine;
import patterns.abstractfacotry.car.Wheel;

public class BMWFactory implements CarFactory {
    @Override
    public Body createFrame() {
        return new BMWBody();
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
