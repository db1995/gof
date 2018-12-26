package com.github.gof.creational.singleton.demo3;

/**
 * 静态内部类式单例模式
 * 延时加载
 *
 * @author db1995
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {

    }

    private static class Inner {
        private static /*final*/ StaticInnerSingleton single = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return Inner.single;
    }
}
