package com.github.gof.behavioral.chainofresponsibility.example1;

public abstract class Leader {
    protected String name;
    protected Leader senior;

    public Leader(String name) {
        this.name = name;
    }

    public void setSenior(Leader senior) {
        this.senior = senior;
    }

    abstract void handleLeave(Leave leave);
}
