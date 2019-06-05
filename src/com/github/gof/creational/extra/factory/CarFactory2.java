package com.github.gof.creational.extra.factory;

public class CarFactory2 {
    public Car createAudi() {
        return new Audi();
    }

    public Car createBenz() {
        return new Benz();
    }
}
