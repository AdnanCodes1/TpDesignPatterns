package org.AdnanCodes1.DP_Iterator;

public class Main {

    public static void main(String[] args){
        BookModel book1 = new BookModel("Brave New World", "Aldous Huxley", 15.20);
        BookModel book2 = new BookModel("The Hobbit", "J.R.R. Tolkien", 13.99);
        BookModel book3 = new BookModel("Fahrenheit 451", "Ray Bradbury", 12.30);
        BookModel book4 = new BookModel("Moby-Dick", "Herman Melville", 17.50);
        BookModel book5 = new BookModel("War and Peace", "Leo Tolstoy", 19.95);
        BookModel book6 = new BookModel("The Alchemist", "Paulo Coelho", 10.80);
        BookModel book7 = new BookModel("The Little Prince", "Antoine de Saint-Exupéry", 9.99);
        BookModel book8 = new BookModel("Crime and Punishment", "Fyodor Dostoevsky", 14.40);
        BookModel book9 = new BookModel("Jane Eyre", "Charlotte Brontë", 13.60);
        BookModel book10 = new BookModel("The Road", "Cormac McCarthy", 11.25);

        BookCollection library = new BookCollection();
        library.addBook(book1);
        System.out.println("***************************************************************");
        library.addBook(book2);
        System.out.println("***************************************************************");
        library.addBook(book3);
        System.out.println("***************************************************************");
        library.addBook(book4);
        System.out.println("***************************************************************");
        library.addBook(book5);
        System.out.println("***************************************************************");
        library.addBook(book6);
        System.out.println("***************************************************************");
        library.addBook(book7);
        System.out.println("***************************************************************");
        library.addBook(book8);
        System.out.println("***************************************************************");
        library.addBook(book9);
        System.out.println("***************************************************************");
        library.addBook(book10);

        Iterator<BookModel> iterator = library.createIterator();

        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("---------------------------------------------------------------");
        }


    }

}
