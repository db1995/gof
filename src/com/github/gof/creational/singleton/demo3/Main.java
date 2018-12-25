package com.github.gof.creational.singleton.demo3;

/**
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //true
        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
    }
}
