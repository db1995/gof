package com.github.gof.creational.abstractfactory;

public class BadEngine implements Engine {
    @Override
    public void run() {
        System.out.println("Run slow");
    }
}
