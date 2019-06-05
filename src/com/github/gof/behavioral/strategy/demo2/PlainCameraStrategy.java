package com.github.gof.behavioral.strategy.demo2;

/**
 * @author db1995
 */
public class PlainCameraStrategy implements CameraStrategy {
    @Override
    public void takePhoto() {
        System.out.println("一般的摄像头拍出的照片也一般");
    }
}
