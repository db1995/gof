package com.github.gof.behavioral.observer.demo1;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author db1995
 */
public class Observable {
    private final CopyOnWriteArraySet<Observer> set = new CopyOnWriteArraySet<>();
    private boolean changed = false;

    public synchronized void addObserver(Observer o) {
        set.add(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        if (!changed) {
            return;
        }
        for (Observer o : set) {
            o.update(this, arg);
        }
        clearChanged();
    }

    public synchronized void deleteObserver(Observer o) {
        set.remove(o);
    }

    public synchronized void deleteObservers() {
        set.clear();
    }

    protected synchronized void setChanged() {
        changed = true;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    public synchronized int countObservers() {
        return set.size();
    }
}
