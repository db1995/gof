package com.github.gof.structural.bridge.demo1;

/**
 * 桥接模式
 * 将抽象部分与实现部分分离开来，使它们都可以独立变化
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        //创建不同的编程语言对象
        Language java = new JavaLanguage();
        Language python = new PythonLanguage();

        //让一个聪明人学习Java
        Learner smart1 = new SmartLearner(java);
        smart1.learn(); //SmartLearner：I'm learning Java.
        //让另一个聪明人学习Python
        Learner smart2 = new SmartLearner(python);
        smart2.learn(); //SmartLearner：I'm learning Python.

        //让一个普通人学习Java
        Learner ordinary1 = new OrdinaryLearner(java);
        ordinary1.learn();  //OrdinaryLearner：I'm learning Java.
        //让另一个普通人学习Python
        Learner ordinary2 = new OrdinaryLearner(python);
        ordinary2.learn();  //OrdinaryLearner：I'm learning Python.
    }
}
