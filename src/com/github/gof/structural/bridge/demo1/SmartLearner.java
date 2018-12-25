package com.github.gof.structural.bridge.demo1;

/**
 * 天赋异禀的学习者
 * @author db1995
 */
public class SmartLearner extends Learner {
    public SmartLearner(Language language) {
        super(language);
    }

    @Override
    public void learn() {
        System.out.print(this.getClass().getSimpleName() + "：");
        this.getLanguage().learn();
    }
}
