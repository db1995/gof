package com.github.gof.structural.bridge.demo1;

/**
 * 普通天分的学习者
 * @author db1995
 */
public class OrdinaryLearner extends Learner {
    public OrdinaryLearner(Language language) {
        super(language);
    }

    @Override
    public void learn() {
        System.out.print(this.getClass().getSimpleName() + "：");
        this.getLanguage().learn();
    }
}
