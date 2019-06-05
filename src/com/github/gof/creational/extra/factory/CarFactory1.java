package com.github.gof.creational.extra.factory;

public class CarFactory1 {
    public Car createCar(String type) {
        if (type.equals("Audi")) {
            return new Audi();
        } else if (type.equals("Benz")) {
            return new Benz();
        } //可不断扩展...
        return null;
    }
}
