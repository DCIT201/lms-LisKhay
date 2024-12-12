package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("The Girl Who can", "Ama Ataa Aidoo", 1996));
        library.addBook(new Book("The Generous Hunter", "AA Amoako", 1999));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Atakora", 1);

        // Borrow a book
        patron.borrowBook(new Book("The Generous Hunter", "AA Amoako", 1999), library);

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("The Generous Hunter", "AA Amoako", 1999), library);

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}