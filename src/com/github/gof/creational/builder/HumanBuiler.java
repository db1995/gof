package com.github.gof.creational.builder;

public interface HumanBuiler {
    void buildHead();
    void buildBody();
    void buildHand();
    void buildFoot();
    Human build();
}
