package patterns.abstractfacotry;

import patterns.abstractfacotry.benz.BenzFactory;
import patterns.abstractfacotry.bmw.BMWFactory;
import patterns.abstractfacotry.car.Body;
import patterns.abstractfacotry.car.CarFactory;
import patterns.abstractfacotry.car.Engine;
import patterns.abstractfacotry.car.Wheel;

public class Main {
    public static void main(String[] args) {
        // 간단한 변경으로 다른 종류의 car 를 만들수 있다.
        CarFactory carFactory = new BenzFactory();
        //CarFactory carFactory = new BMWFactory();

        Body body = carFactory.createBody();
        Wheel wheel = carFactory.createWheel();
        Engine engine = carFactory.createEngine();

        body.info();
        wheel.info();
        engine.info();
    }
}
