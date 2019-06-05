package com.github.gof.structural.adapter.example3;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("标准接口");
    }
}
