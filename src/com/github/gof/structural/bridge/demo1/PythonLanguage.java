package com.github.gof.structural.bridge.demo1;

/**
 * Python语言
 *
 * @author db1995
 */
public class PythonLanguage implements Language {
    @Override
    public void beLearned() {
        System.out.println("I'm learning Python.");
    }
}
