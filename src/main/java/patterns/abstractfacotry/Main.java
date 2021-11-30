package patterns.abstractfacotry;

import patterns.abstractfacotry.benz.BenzFactory;
import patterns.abstractfacotry.bmw.BMWFactory;
import patterns.abstractfacotry.car.Frame;
import patterns.abstractfacotry.car.CarFactory;
import patterns.abstractfacotry.car.Engine;
import patterns.abstractfacotry.car.Wheel;

public class Main {
    public static void main(String[] args) {
        // 간단한 변경으로 다른 종류의 car 를 만들수 있다.
        /*
        CarFactory benzCarFactory = new BenzFactory();
        CarFactory BMWCarFactory = new BMWFactory();
         */

        CarFactory carFactory =  CarFactoryMethod.getInstance(1);

        Frame body = carFactory.createFrame();
        Wheel wheel = carFactory.createWheel();
        Engine engine = carFactory.createEngine();

        body.info();
        wheel.info();
        engine.info();
    }
}
