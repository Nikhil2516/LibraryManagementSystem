package org.example;

import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 2017);
        book2 = new Book("978-0596009205", "Head First Java", "Kathy Sierra", 2005);
        book3 = new Book("978-0132350884", "Clean Code", "Robert C. Martin", 2008);

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
        assertTrue(library.isBookAvailable("978-0134685991"), "Effective Java should be available.");
        assertTrue(library.isBookAvailable("978-0596009205"), "Head First Java should be available.");
        assertTrue(library.isBookAvailable("978-0132350884"), "Clean Code should be available.");
    }

    // Test case to check issuing a book
    @Test
    public void testIssueBook() throws Exception {
        library.issueBook("978-0134685991");
        assertFalse(book1.isAvailable(), "Effective Java should be marked as unavailable after issuing.");
    }

    // Test case to check issuing a book that is already issued
    @Test
    public void testIssueAlreadyIssuedBook() throws Exception {
        library.issueBook("978-0134685991");
        Exception exception = assertThrows(Exception.class, () -> {
            library.issueBook("978-0134685991");
        });
        assertEquals("Book is Not Available", exception.getMessage());
    }


}