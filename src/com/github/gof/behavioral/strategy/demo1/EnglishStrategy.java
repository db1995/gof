package com.github.gof.behavioral.strategy.demo1;

/**
 * @author db1995
 */
public class EnglishStrategy implements LanguageStrategy {
    @Override
    public void say() {
        System.out.println("Hello World");
    }
}
