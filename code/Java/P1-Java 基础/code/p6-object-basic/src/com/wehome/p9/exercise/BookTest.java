package com.wehome.p9.exercise;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book();

        book.setBookName("三国演义");
        book.setAuthor("罗贯中");
        book.setPublisher("中央人民出版社");
        book.setPrice(99.9);

        book.getInfo();
    }

}
