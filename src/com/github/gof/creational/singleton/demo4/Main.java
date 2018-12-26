package com.github.gof.creational.singleton.demo4;

/**
 * 枚举式单例模式
 * 不能延时加载
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
    }
}
