package com.github.gof.creational.factorymethod.demo1;

/**
 * 奥迪汽车工厂
 *
 * @author db1995
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
