package com.github.gof.creational.singleton.demo1;

/**
 * 饿汉式单例模式
 * 不能延时加载
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(EagerSingleton.getInstance() == EagerSingleton.getInstance());
    }
}
