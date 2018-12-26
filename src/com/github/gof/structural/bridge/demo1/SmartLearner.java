package com.github.gof.structural.bridge.demo1;

/**
 * 天赋异禀的学习者
 *
 * @author db1995
 */
class SmartLearner extends Learner {
    SmartLearner(Language language) {
        super(language);
    }

    @Override
    void learn() {
        System.out.print(this.getClass().getSimpleName() + "：");
        this.getLanguage().beLearned();
    }
}
