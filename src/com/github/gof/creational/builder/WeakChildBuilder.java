package com.github.gof.creational.builder;

public class WeakChildBuilder implements HumanBuiler {
    Human human;

    public WeakChildBuilder() {
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("小巧玲珑");
    }

    @Override
    public void buildBody() {
        human.setBody("风吹就倒");
    }

    @Override
    public void buildHand() {
        human.setHand("手无缚鸡");
    }

    @Override
    public void buildFoot() {
        human.setFoot("难以站稳");
    }

    @Override
    public Human build() {
        return human;
    }
}
