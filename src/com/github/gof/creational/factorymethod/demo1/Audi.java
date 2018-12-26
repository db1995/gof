package com.github.gof.creational.factorymethod.demo1;

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
