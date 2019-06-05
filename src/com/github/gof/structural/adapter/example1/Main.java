package com.github.gof.structural.adapter.example1;

/**
 * @author db1995
 * @description 将一段字符串通过适配器进行处理（使用继承）
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}