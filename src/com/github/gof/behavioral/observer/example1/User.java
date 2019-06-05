package com.github.gof.behavioral.observer.example1;

public abstract class User {
    protected String message;
    protected String name;

    public User(String name) {
        this.name = name;
    }

    abstract void update(Server server);

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
