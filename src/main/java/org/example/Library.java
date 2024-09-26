package org.example;

import java.util.ArrayList;
import java.util.List;

//Representing Library with books
public class Library {
    private List<Book> books;

    // Constructor of Library with empty list of books
    Library()
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }
}
