package org.AdnanCodes1.DP_Iterator;

import java.util.List;

public class BookIterator implements Iterator<BookModel>{
    private int position = 0;
    private List<BookModel> bookCollection;

    public BookIterator(List<BookModel> bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public boolean hasNext() {
        return position < bookCollection.size();
    }

    @Override
    public BookModel next() {
        return bookCollection.get(position++);
    }
}
