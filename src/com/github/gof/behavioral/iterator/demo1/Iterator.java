package com.github.gof.behavioral.iterator.demo1;

/**
 * 用于遍历集合中的元素
 *
 * @author db1995
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}
