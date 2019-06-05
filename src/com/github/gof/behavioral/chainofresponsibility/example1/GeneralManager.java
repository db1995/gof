package com.github.gof.behavioral.chainofresponsibility.example1;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void handleLeave(Leave leave) {
        if (leave.getLeaveDays() < 7) {
            System.out.println(this.name + "：小于7天的假我批了");
        } else {
            System.out.println(this.name + "：大于7天的假我批不了，转交给上级处理");
            senior.handleLeave(leave);
        }
    }
}
