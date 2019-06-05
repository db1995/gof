package com.github.gof.creational.extra.factory;

/**
 * 简单工厂模式
 * 也称静态工厂模式
 * 不属于23种设计模式之一
 */
public class Test {
    public static void main(String[] args) {
        //原始方法创建对象
        new Audi().run();
        new Benz().run();

        //第一种简单工厂模式创建对象
        CarFactory1 carFactory1 = new CarFactory1();
        carFactory1.createCar("Audi").run();
        carFactory1.createCar("Benz").run();

        //第二种简单工厂模式创建对象
        CarFactory2 carFactory2 = new CarFactory2();
        carFactory2.createAudi().run();
        carFactory2.createBenz().run();
    }
}
