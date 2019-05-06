package com.github.gof.behavioral.strategy.demo1;

/**
 * @author db1995
 */
public class JapaneseStrategy implements LanguageStrategy {
    @Override
    public void say() {
        System.out.println("こんにちは世界");
    }
}
