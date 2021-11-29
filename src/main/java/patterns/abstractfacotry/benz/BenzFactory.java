package patterns.abstractfacotry.benz;

import patterns.abstractfacotry.car.Body;
import patterns.abstractfacotry.car.CarFactory;
import patterns.abstractfacotry.car.Engine;
import patterns.abstractfacotry.car.Wheel;

public class BenzFactory implements CarFactory {
    @Override
    public Body createFrame() {
        return new BenzBody();
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
