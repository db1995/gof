package com.github.gof.creational.singleton.demo4;

/**
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(SingletonDemo.INSTANCE == SingletonDemo.INSTANCE);
    }
}
