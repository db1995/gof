package com.github.gof.creational.abstractfactory;

public class GoodCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new GoodEngine();
    }
    @Override
    public Tyre createTyre() {
        return new GoodTyre();
    }
}
