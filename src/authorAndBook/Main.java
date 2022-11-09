package authorAndBook;

import java.util.Arrays;

/**
 * 1. Эки класс тузунуз
 * Author ( fullName, email, gender)
 * Book ( name, author, price, qty)
 * 2.
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Samanchyn", new Author( "dd", "dfdsd", 'm'),234, 60);
        Book book2 = new Book("Samanchyn", new Author( "dd", "dfdsd", 'm'),134, 60);
        Book book3 = new Book("Samanchyn", new Author( "dd", "dfdsd", 'm'),34, 60);

        Book[] books = {book1, book2, book3};

       Arrays.sort(books);
        System.out.println(Arrays.asList(books));
    }



}
