package com.github.gof.creational.singleton.demo3;

/**
 * 静态内部类式单例模式
 * 延时加载
 *
 * @author db1995
 */
public class SingletonDemo {
    private SingletonDemo() {

    }

    private static class SingletonDemo3Inner {
        private static /*final*/ SingletonDemo singleDemo3 = new SingletonDemo();
    }

    public static SingletonDemo getInstance() {
        return SingletonDemo3Inner.singleDemo3;
    }
}
