package com.github.gof.behavioral.strategy.demo1;

/**
 * @author db1995
 */
public class ChineseStrategy implements LanguageStrategy {
    @Override
    public void say() {
        System.out.println("你好世界");
    }
}
