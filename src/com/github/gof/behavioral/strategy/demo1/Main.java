package com.github.gof.behavioral.strategy.demo1;

/**
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new EnglishStrategy());
        robot.say();
        robot.setLanguage(new JapaneseStrategy());
        robot.say();
        robot.setLanguage(new ChineseStrategy());
        robot.say();
    }
}
