package com.github.gof.creational.singleton.demo2;

/**
 * 饱（懒）汉式单例模式
 * 延时加载
 * 效率低
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());
    }
}
