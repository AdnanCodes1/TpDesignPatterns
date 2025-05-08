package org.AdnanCodes1.DP_Iterator;

public class BookModel {

    private String title;
    private String author;
    private double price;

    public BookModel(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book title : " + title + "\nAuthor : " + author + "\nPrice : " + price;
    }
}
