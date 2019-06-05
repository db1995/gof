package com.github.gof.behavioral.observer.example1;

public class WeChatUser extends User {
    public WeChatUser(String name) {
        super(name);
    }

    @Override
    public void update(Server server) {
        this.message = server.getMessage();
    }
}
