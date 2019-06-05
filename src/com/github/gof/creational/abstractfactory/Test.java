package com.github.gof.creational.abstractfactory;

/**
 * 抽象工厂模式
 * 不可增加单一产品，而是增加产品族
 */
public class Test {
    public static void main(String[] args) {
        new GoodCarFactory().createEngine().run();
        new GoodCarFactory().createTyre().roll();

        new BadCarFactory().createEngine().run();
        new BadCarFactory().createTyre().roll();
    }
}
