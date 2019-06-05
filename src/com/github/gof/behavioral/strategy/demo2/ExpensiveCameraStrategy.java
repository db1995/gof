package com.github.gof.behavioral.strategy.demo2;

/**
 * @author db1995
 */
public class ExpensiveCameraStrategy implements CameraStrategy {
    @Override
    public void takePhoto() {
        System.out.println("华贵的摄像头拍出华丽的风景线");
    }
}
