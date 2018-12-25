package com.github.gof.structural.bridge.demo1;

/**
 * 学习者
 * @author db1995
 */
public abstract class Learner {
    private Language language;

    public Learner(Language language) {
        this.language = language;
    }

    public abstract void learn();

    public Language getLanguage() {
        return language;
    }
}
