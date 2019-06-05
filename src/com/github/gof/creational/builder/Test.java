package com.github.gof.creational.builder;

/**
 * 建造者模式
 * 扩展时只需编写HumanBuilder的实现类即可
 * HumanDirector组装Human的方式是保持不变的
 */
public class Test {
    public static void main(String[] args) {
        HumanDirector humanDirector = new HumanDirector();

        Human strongMan = humanDirector.createHuman(new StrongManBuilder());
        System.out.println(strongMan);

        Human weakChild = humanDirector.createHuman(new WeakChildBuilder());
        System.out.println(weakChild);
    }
}
