package com.github.gof.creational.factorymethod.demo1;

/**
 * 奔驰汽车
 *
 * @author db1995
 */
public class Benz implements Car {
    @Override
    public void run() {
        System.out.println("Benz run...");
    }
}
