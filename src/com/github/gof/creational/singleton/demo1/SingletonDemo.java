package com.github.gof.creational.singleton.demo1;

/**
 * 饿汉式单例模式
 * 不能延时加载
 *
 * @author db1995
 */
public class SingletonDemo {
    private static /*final*/ SingletonDemo singletonDemo = new SingletonDemo();

    private SingletonDemo() {

    }

    public static /*synchronized*/ SingletonDemo getInstance() {
        return singletonDemo;
    }
}
