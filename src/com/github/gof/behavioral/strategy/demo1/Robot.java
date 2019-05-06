package com.github.gof.behavioral.strategy.demo1;

/**
 * @author db1995
 */
public class Robot {
    private LanguageStrategy language;

    public Robot(LanguageStrategy language) {
        this.language = language;
    }

    public void say() {
        language.say();
    }

    public LanguageStrategy getLanguage() {
        return language;
    }

    public void setLanguage(LanguageStrategy language) {
        this.language = language;
    }
}
