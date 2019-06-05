package com.github.gof.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Server {
    protected String message;
    protected List<User> list = new ArrayList<>();

    abstract void attachUser(User user);
    abstract void detachUser(User user);
    abstract void notifyUsers(List<User> users);

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyUsers(list);
    }
}
