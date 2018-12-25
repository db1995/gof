package com.github.gof.behavioral.iterator.demo1;

/**
 * 书架为图书的数组
 *
 * @author db1995
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;    //这里也许还可以写成return books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
