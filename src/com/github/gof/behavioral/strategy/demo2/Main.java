package com.github.gof.behavioral.strategy.demo2;

/**
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(new PlainCameraStrategy());
        phone.takePhoto();
        phone.setCamera(new ExpensiveCameraStrategy());
        phone.takePhoto();
    }
}
