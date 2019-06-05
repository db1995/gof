package com.github.gof.creational.abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
}
