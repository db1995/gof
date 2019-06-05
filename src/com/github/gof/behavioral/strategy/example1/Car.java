package com.github.gof.behavioral.strategy.example1;

public class Car {
    private String name;
    private Map map;

    public Car(String name, Map map) {
        this.name = name;
        this.map = map;
    }

    public void useMap() {
        System.out.print(name + "：");
        map.navigate();
    }
}
