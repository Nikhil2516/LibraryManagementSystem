package org.example;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    // Constructor to initialize Book object
    public Book(String ISBN, String title, String author, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;  // Books are available by default when added
    }

    // Getters and setters for book attributes
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to display book details
    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
    }
}
