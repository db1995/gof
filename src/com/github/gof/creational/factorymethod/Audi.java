package com.github.gof.creational.factorymethod;

/**
 * 奥迪汽车
 *
 * @author db1995
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("Audi run...");
    }
}
