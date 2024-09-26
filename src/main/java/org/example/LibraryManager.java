package org.example;



public class LibraryManager {
    public static void main(String[] args) {
        // Create library object
        Library library = new Library();

        // Add some books to the library
        Book book1 = new Book("3278", "Wings of Fire", "APJ Abdul Kalam", 2017);
        Book book2 = new Book("7635", "The Road", "McCarthy", 2006);
        Book book3 = new Book("8736", "Project Hail Mary", "Andy Weir", 2021);
        Book book4 = new Book("4653", "Madhur Smriti", "Meenal Prakash", 2023);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Print available books
        library.printAvailableBooks();

        try {
            // Check if a book is available and issue it
            library.issueBook("3278"); // Issue "Effective Java"
            library.issueBook("8736"); // Issue "Head First Java"

            // Attempt to issue a book that is already issued
            library.issueBook("8736"); // Will throw "Book is Not Available" error

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Print available books after issuing
        library.printAvailableBooks();

        try {
            // Return a book and print the available books again
            library.returnBook("8736"); // Return "Effective Java"
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Print available books after return
        library.printAvailableBooks();
    }
}