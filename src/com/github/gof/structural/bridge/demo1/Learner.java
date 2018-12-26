package com.github.gof.structural.bridge.demo1;

/**
 * 学习者
 *
 * @author db1995
 */
abstract class Learner {
    private Language language;

    Learner(Language language) {
        this.language = language;
    }

    abstract void learn();

    Language getLanguage() {
        return language;
    }
}
