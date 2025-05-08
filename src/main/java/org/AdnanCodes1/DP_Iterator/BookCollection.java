package org.AdnanCodes1.DP_Iterator;

import java.awt.print.Book;
import java.util.*;

public class BookCollection {

    private List<BookModel> collection = new ArrayList<>();

    public void addBook(BookModel newBook){
        collection.add(newBook);
        System.out.println("Book : " + newBook.getTitle() + " added successfully!");
    }

    public Iterator<BookModel> createIterator(){
        return new BookIterator(this.collection);
    }

}
