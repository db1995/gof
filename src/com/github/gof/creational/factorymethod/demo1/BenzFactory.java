package com.github.gof.creational.factorymethod.demo1;

/**
 * 奔驰汽车工厂
 *
 * @author db1995
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
