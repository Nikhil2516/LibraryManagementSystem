package org.example;

import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("3278", "Wings of Fire", "APJ Abdul Kalam", 2017);
        book2 = new Book("7635", "The Road", "McCarthy", 2006);
        book3 = new Book("8736", "Project Hail Mary", "Andy Weir", 2021);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

//    Test case for test how many books we are added
    @Test
    public void testAddBook() {
        assertEquals(3, library.getBooks());
    }

    // Test case to verify that books are available when added
    @Test
    public void testBookAvailability() throws Exception {
        assertTrue(library.isBookAvailable("3278"), "Wings of Fire");
        assertTrue(library.isBookAvailable("7635"), "The Road");
        assertTrue(library.isBookAvailable("8736"), "Project Hail Mary");
    }

    // Test case to check issuing a book
    @Test
    public void testIssueBook() throws Exception {
        library.issueBook("3278");
        assertFalse(book1.isAvailable(), "Wings of Fire should be marked as unavailable after issuing.");
    }

    // Test case to check issuing a book that is already issued
    @Test
    public void testIssueAlreadyIssuedBook() throws Exception {
        library.issueBook("3278");
        Exception exception = assertThrows(Exception.class, () -> {
            library.issueBook("3278");
        });
        assertEquals("Book is Not Available", exception.getMessage());
    }

    // Test case to check issuing a book that doesn't exist
    @Test
    public void testIssueNonExistentBook() {
        Exception exception = assertThrows(Exception.class, () -> {
            library.issueBook("3456");
        });
        assertEquals("Book with ISBN 3456 does not exist in the library.", exception.getMessage());
    }

    // Test case to check returning a book
    @Test
    public void testReturnBook() throws Exception {
        library.issueBook("3278");
        library.returnBook("3278");
        assertTrue(book1.isAvailable(), "Wings of Fire should be marked as available after returning.");
    }

    // Test case to check returning a book that was not issued
    @Test
    public void testReturnNonIssuedBook() {
        Exception exception = assertThrows(Exception.class, () -> {
            library.returnBook("8736");
        });
        assertEquals("The book was not issued, so it cannot be returned.", exception.getMessage());
    }

    // Test case to check returning a book that doesn't exist
    @Test
    public void testReturnNonExistentBook() {
        Exception exception = assertThrows(Exception.class, () -> {
            library.returnBook("3456");
        });
        assertEquals("Book with ISBN 3456 does not exist in the library.", exception.getMessage());
    }

    // Test case to verify printing of available books
    @Test
    public void testPrintAvailableBooks() throws Exception {
        library.issueBook("3278");
        library.printAvailableBooks(); // Should print available books except "Effective Java"
        assertTrue(book2.isAvailable(), "The Road should still be available.");
        assertTrue(book3.isAvailable(), "Project Hail Mary should still be available.");
    }

    @Test
    public void testDeleteBook() throws Exception
    {
        assertFalse(library.deleteBook("3254"));
    }

}