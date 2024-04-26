package com.wehome.p9.exercise;

public class Book {

    private String bookName;
    private String author;
    private String publisher;
    private double price;

    public void setBookName(String bName) {
        bookName = bName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println("书名: " + bookName + ", 作者: " + author +
                ", 出版社名" + publisher + ", 价格: " + price);
    }

}
