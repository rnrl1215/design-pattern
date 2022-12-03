package study.patterns.abstractfacotry;

import study.patterns.abstractfacotry.car.Engine;
import study.patterns.abstractfacotry.car.Frame;
import study.patterns.abstractfacotry.car.Wheel;
import study.patterns.abstractfacotry.car.CarFactory;

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
