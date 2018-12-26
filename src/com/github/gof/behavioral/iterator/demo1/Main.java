package com.github.gof.behavioral.iterator.demo1;

/**
 * 迭代器模式
 * 本例书架采用的是数组，长度固定
 * 将书放置到书架中，并将书的名字按顺序显示出来
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        //写成这样好像也可以：Iterator iterator = new BookShelfIterator(bookShelf);
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
        //A B C D
    }
}