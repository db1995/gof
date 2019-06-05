package com.github.gof.creational.builder;

public class HumanDirector {
    public Human createHuman(HumanBuiler humanBuiler) {
        humanBuiler.buildHead();
        humanBuiler.buildBody();
        humanBuiler.buildHand();
        humanBuiler.buildFoot();
        Human human = humanBuiler.build();
        return human;
    }
}
