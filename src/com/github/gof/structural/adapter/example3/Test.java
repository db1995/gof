package com.github.gof.structural.adapter.example3;

/**
 * 适配器模式
 */
public class Test {
    public static void main(String[] args) {
        //使用标准接口
        Target target1 = new ConcreteTarget();
        target1.request();

        //适配特殊接口
        Target target2 = new Adapter(new Adaptee());
        target2.request();
    }
}
