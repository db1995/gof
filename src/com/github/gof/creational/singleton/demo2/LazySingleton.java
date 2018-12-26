package com.github.gof.creational.singleton.demo2;

/**
 * 饱（懒）汉式单例模式
 * 延时加载
 * 效率低
 *
 * @author db1995
 */
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {

    }

    //加上synchronize以防止多线程情况下同事调用该方法从而创建两个对象的情况
    public static synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
