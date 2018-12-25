package com.github.gof.structural.bridge.demo1;

public class Main {
    public static void main(String[] args) {
        //创建不同的编程语言对象
        Language java = new JavaLanguage();
        Language python = new PythonLanguage();

        //让一个聪明人学习Java
        Learner smart1 = new SmartLearner(java);
        smart1.learn();
        //让另一个聪明人学习Python
        Learner smart2 = new SmartLearner(python);
        smart2.learn();

        //让一个普通人学习Java
        Learner ordinary1 = new OrdinaryLearner(java);
        ordinary1.learn();
        //让另一个普通人学习Python
        Learner ordinary2 = new OrdinaryLearner(python);
        ordinary2.learn();
    }
}
