package com.github.gof.behavioral.chainofresponsibility.example1;

public class Leave {
    private String name;
    private int leaveDays;
    private String reason;

    public Leave(String name, int leaveDays, String reason) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
