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

    public int getBooks()
    {
        return books.size();
    }

//    To check availabality of Book
    public boolean isBookAvailable(String ISBN) throws Exception {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (book.isAvailable()) {
                    return true;
                } else {
                    throw new Exception("Book is Not Available");
                }
            }
        }
        throw new Exception("Book with ISBN " + ISBN + " does not exist in the library.");
    }

    // Method to issue a book based on ISBN
    public void issueBook(String ISBN) throws Exception {
        if (isBookAvailable(ISBN)) {
            for (Book book : books) {
                if (book.getISBN().equals(ISBN)) {
                    book.setAvailable(false);
                    System.out.println("The book with ISBN " + ISBN + " has been issued.");
                    return;
                }
            }
        }
    }
}
