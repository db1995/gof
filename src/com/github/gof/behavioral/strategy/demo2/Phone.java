package com.github.gof.behavioral.strategy.demo2;

/**
 * @author db1995
 */
public class Phone {
    private CameraStrategy camera;

    public Phone(CameraStrategy camera) {
        this.camera = camera;
    }

    public void takePhoto() {
        camera.takePhoto();
    }

    public void setCamera(CameraStrategy camera) {
        this.camera = camera;
    }
}
