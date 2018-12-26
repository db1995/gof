package com.github.gof.creational.singleton.demo3;

/**
 * 静态内部类式单例模式
 * 延时加载
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(StaticInnerSingleton.getInstance() == StaticInnerSingleton.getInstance());
    }
}
