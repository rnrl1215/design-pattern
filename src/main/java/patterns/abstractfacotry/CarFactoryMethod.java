package patterns.abstractfacotry;

import patterns.abstractfacotry.benz.BenzFactory;
import patterns.abstractfacotry.bmw.BMWFactory;
import patterns.abstractfacotry.car.CarFactory;

public class CarFactoryMethod {

    static public CarFactory getInstance(int type) {
        switch (type) {
            case 1:
                return new BenzFactory();
            case 2:
                return new BMWFactory();
            default:
                System.out.println("존재 하지 않는 타입입니다. BenzFactory 를 반환합니다.");
                return new BenzFactory();
        }
    }
}
