package com.github.gof.creational.abstractfactory;

public class BadCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new BadEngine();
    }

    @Override
    public Tyre createTyre() {
        return new BadTyre();
    }
}
