package com.github.gof.creational.singleton.demo1;

/**
 * 饿汉式单例模式
 * 不能延时加载
 *
 * @author db1995
 */
public class EagerSingleton {
    private static /*final*/ EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static /*synchronized*/ EagerSingleton getInstance() {
        return singleton;
    }
}
