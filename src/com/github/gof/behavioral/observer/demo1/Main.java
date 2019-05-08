package com.github.gof.behavioral.observer.demo1;

/**
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        WeChatServer server = new WeChatServer();
        User user1 = new User("John");
        User user2 = new User("Mike");
        User user3 = new User("lucy");

        server.addObserver(user1);
        server.addObserver(user2);
        server.addObserver(user3);
        server.setChanged();
        server.notifyObservers("Hello");

        server.setChanged();
        server.deleteObserver(user2);
        server.notifyObservers("World");
    }
}
