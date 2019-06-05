package com.github.gof.behavioral.chainofresponsibility.example1;

public class Main {
    public static void main(String[] args) {
        //创建若干个不同的请假条
        Leave leave1 = new Leave("小北", 2, "感冒");
        Leave leave2 = new Leave("小上", 5, "重感冒且发烧");
        Leave leave3 = new Leave("小广", 10, "回老家探亲");
        Leave leave4 = new Leave("小深", 18, "干活太累了");

        //创建若干个领导对象
        Leader groupLeader = new GroupLeader("组长");
        Leader generalManager = new GeneralManager("总经理");
        Leader chairman = new Chairman("董事长");

        //确定领导之间的层级关系
        groupLeader.setSenior(generalManager);
        generalManager.setSenior(chairman);

        //处理请假条
        groupLeader.handleLeave(leave1);
        System.out.println("======================================");
        groupLeader.handleLeave(leave2);
        System.out.println("======================================");
        groupLeader.handleLeave(leave3);
        System.out.println("======================================");
        groupLeader.handleLeave(leave4);
    }
}
