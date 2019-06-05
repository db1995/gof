package com.github.gof.creational.prototype.shallow;

import java.util.Date;

public class Sheep implements Cloneable {
    private String name;
    private Date birthday;

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //浅复制重写Object的clone()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
