package com.github.gof.behavioral.strategy.example1;

public class Main {
    public static void main(String[] args) {
        //创建不同种类的车对象，配置不同的导航系统
        Car benz = new Car("奔驰", new AMap());
        Car bmw = new Car("宝马", new BaiduMap());
        Car audi = new Car("奥迪", new TencentMap());

        //开启导航
        benz.useMap();
        bmw.useMap();
        audi.useMap();
    }
}
