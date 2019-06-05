package com.github.gof.creational.abstractfactory;

public class GoodTyre implements Tyre {
    @Override
    public void roll() {
        System.out.println("Roll fast");
    }
}
