package com.github.gof.behavioral.strategy.example1;

public class BaiduMap implements Map {
    @Override
    public void navigate() {
        System.out.println("百度地图持续为您导航");
    }
}
