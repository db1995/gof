package com.github.gof.creational.prototype.deep;

import java.util.Date;

/**
 * 浅复制
 * 将一个对象复制后，基本数据类型的变量都会重新创建
 * 而引用类型，指向的还是原对象所指向的
 */
public class Test {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1132523629824L);
        Sheep sheep1 = new Sheep("多利", date);
        Sheep sheep2 = (Sheep) sheep1.clone();

        System.out.println(sheep1 == sheep2);
        System.out.println(sheep1.getName() + " " + sheep1.getBirthday());
        System.out.println(sheep2.getName() + " " + sheep2.getBirthday());

        sheep1.setName("大蒜");
        date.setTime(2342358927598L);

        System.out.println(sheep1 == sheep2);
        System.out.println(sheep1.getName() + " " + sheep1.getBirthday());
        System.out.println(sheep2.getName() + " " + sheep2.getBirthday());
    }
}
