package com.github.gof.structural.adapter.practice;

import java.io.IOException;

/**
 * @author db1995
 * @description 从流中取出属性或将属性写入流中
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("./src/adapter/demo2/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("./src/adapter/demo2/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f.getValue("year"));
        System.out.println(f.getValue("month"));
        System.out.println(f.getValue("day"));
    }
}
