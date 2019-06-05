package com.github.gof.creational.builder;

public class StrongManBuilder implements HumanBuiler {
    Human human;

    public StrongManBuilder() {
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("肥头大脑");
    }

    @Override
    public void buildBody() {
        human.setBody("高大魁梧");
    }

    @Override
    public void buildHand() {
        human.setHand("强壮有力");
    }

    @Override
    public void buildFoot() {
        human.setFoot("一脚遮天");
    }

    @Override
    public Human build() {
        return human;
    }
}
