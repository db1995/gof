package com.github.gof.structural.bridge.demo1;

/**
 * 普通天分的学习者
 *
 * @author db1995
 */
class OrdinaryLearner extends Learner {
    OrdinaryLearner(Language language) {
        super(language);
    }

    @Override
    void learn() {
        System.out.print(this.getClass().getSimpleName() + "：");
        this.getLanguage().beLearned();
    }
}
