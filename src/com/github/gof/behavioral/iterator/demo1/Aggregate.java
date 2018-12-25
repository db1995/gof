package com.github.gof.behavioral.iterator.demo1;

/**
 * 实现该接口的类可成为一个可以保存多个元素的集合
 *
 * @author db1995
 */
public interface Aggregate {
    Iterator iterator();
}
