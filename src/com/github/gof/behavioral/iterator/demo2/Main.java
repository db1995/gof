package com.github.gof.behavioral.iterator.demo2;

/**
 * 将书放置到书架中，并将书的名字按顺序显示出来
 *
 * @author db1995
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("E"));
        bookShelf.appendBook(new Book("F"));
        bookShelf.appendBook(new Book("G"));
        bookShelf.appendBook(new Book("H"));
        bookShelf.appendBook(new Book("I"));
        bookShelf.appendBook(new Book("J"));
        bookShelf.appendBook(new Book("K"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
