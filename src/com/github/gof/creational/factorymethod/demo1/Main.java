package com.github.gof.creational.factorymethod.demo1;

/**
 * 工厂方法模式
 * 扩展时无需修改之前的类
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        new AudiFactory().createCar().run();    //Audi run...
        new BenzFactory().createCar().run();    //Benz run...
        //需要造新车时只需新建对应工厂，并使之实现CarFactory
    }
}
