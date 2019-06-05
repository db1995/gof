package com.github.gof.behavioral.chainofresponsibility.example1;

public class GroupLeader extends Leader {
    public GroupLeader(String name) {
        super(name);
    }

    @Override
    void handleLeave(Leave leave) {
        if (leave.getLeaveDays() < 3) {
            System.out.println(this.name + "：小于3天的假我批了");
        } else {
            System.out.println(this.name + "：大于3天的假我批不了，转交给上级处理");
            senior.handleLeave(leave);
        }
    }
}
