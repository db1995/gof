package com.github.gof.behavioral.observer.example1;

import java.util.List;

public class WeChatServer extends Server {
    @Override
    public void attachUser(User user) {
        super.list.add(user);
    }

    @Override
    public void detachUser(User user) {
        super.list.remove(user);
    }

    @Override
    public void notifyUsers(List<User> users) {
        for(User user : users) {
            user.update(this);
        }
    }
}
