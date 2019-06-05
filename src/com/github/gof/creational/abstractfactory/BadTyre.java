package com.github.gof.creational.abstractfactory;

public class BadTyre implements Tyre {
    @Override
    public void roll() {
        System.out.println("Roll slow");
    }
}
