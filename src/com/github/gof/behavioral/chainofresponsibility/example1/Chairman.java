package com.github.gof.behavioral.chainofresponsibility.example1;

public class Chairman extends Leader {
    public Chairman(String name) {
        super(name);
    }

    @Override
    void handleLeave(Leave leave) {
        if (leave.getLeaveDays() <= 15) {
            System.out.println(this.name + "：15天之内的假我批了");
        } else {
            System.out.println(this.name + "：请假超过15天？不想干了吧");
        }
    }
}
