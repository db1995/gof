package com.github.gof.behavioral.strategy.example1;

public class AMap implements Map {
    @Override
    public void navigate() {
        System.out.println("高德地图持续为您导航");
    }
}
