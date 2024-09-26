# Library Management System

## Overview
The Library Management System is a simple application designed to manage a collection of books in a library. The system allows users to:
- Add books to the library.
- Issue books to users (marking them as unavailable).
- Return books to the library (marking them as available).
- Check the availability of books.
- Print a list of available books.

The system is implemented in Java following clean coding practices, and the project uses Test-Driven Development (TDD) principles. JUnit 5 is used for unit testing.

## Features
- **Add a Book**: Add books to the library with attributes like ISBN, title, author, and publication year.
- **Issue a Book**: Issue a book to a user if it is available. If the book is already issued, an error will be thrown.
- **Return a Book**: Return a book to the library if it was issued. If the book wasn't issued, an error is thrown.
- **Check Book Availability**: Verify if a specific book is available in the library.
- **Print Available Books**: Display a list of books that are currently available in the library.

## Project Structure
The project is structured as follows:
src 
├── main 
      │ 
      └── java │
               ├── Book.java # Book class representing the book entity
               └── Library.java # Library class managing the collection of books 
       └── test 
           └── java 
                └── LibraryTest.java # Unit tests for the Library class

## Classes

### Book.java
The `Book` class represents a book entity with the following attributes:
- **ISBN**: Unique identifier for the book.
- **Title**: The title of the book.
- **Author**: The author of the book.
- **Publication Year**: The year the book was published.
- **Availability**: A boolean attribute indicating if the book is available for issue.

### Library.java
The `Library` class manages a collection of books and provides functionality to:
- Add new books.
- Issue books to users.
- Return issued books.
- Check if a book is available.
- Print a list of available books.

### LibraryTest.java
The `LibraryTest` class contains unit tests to verify the functionality of the `Library` and `Book` classes. Tests include:
- Adding a book to the library.
- Issuing a book and checking its availability.
- Returning a book and making it available again.
- Handling errors for issuing non-existent or already issued books.
- Handling errors for returning non-issued books.

## How to Run the Project

### Prerequisites
- **Java 8+**
- **JUnit 5** for unit testing
- **Maven** (if using Maven as a build tool)

### Setup and Execution

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Nikhil2516/library-management-system.git
   cd library-management-system
2. **Build the Project**:

bash
Copy code
mvn clean install
Run the Application: Since this is a library system backend, no command-line interaction is provided in the current version. You can run and test the functionality via the unit tests provided.

**Run the Tests**:

bash
Copy code
mvn test
**Requirements**
Java Development Kit (JDK) 8 or higher
Maven
    
