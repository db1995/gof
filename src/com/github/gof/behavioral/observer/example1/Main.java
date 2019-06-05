package com.github.gof.behavioral.observer.example1;

public class Main {
    public static void main(String[] args) {
        //创建微信公众号服务器对象
        Server server = new WeChatServer();

        //创建若干个微信用户
        User user1 = new WeChatUser("小北");
        User user2 = new WeChatUser("小上");
        User user3 = new WeChatUser("小广");

        //使这些微信用户关注微信公众号
        server.attachUser(user1);
        server.attachUser(user2);
        server.attachUser(user3);

        System.out.println("第一天：");
        //公众号推送消息给所有用户
        server.setMessage("Hello World.");

        //打印查看所有用户是否收到公众号推送的消息
        System.out.println(((WeChatUser) user1).getName()
                + "-" + ((WeChatUser) user1).getMessage());
        System.out.println(((WeChatUser) user2).getName()
                + "-" + ((WeChatUser) user2).getMessage());
        System.out.println(((WeChatUser) user3).getName()
                + "-" + ((WeChatUser) user3).getMessage());

        System.out.println("第二天：");
        //user1取消关注
        server.detachUser(user1);

        //公众号再次推送消息给所有用户
        server.setMessage("Java is the best language around the world.");

        //打印查看所有用户是否收到公众号推送的消息
        System.out.println(((WeChatUser) user1).getName()
                + "-" + ((WeChatUser) user1).getMessage());
        System.out.println(((WeChatUser) user2).getName()
                + "-" + ((WeChatUser) user2).getMessage());
        System.out.println(((WeChatUser) user3).getName()
                + "-" + ((WeChatUser) user3).getMessage());
    }
}
