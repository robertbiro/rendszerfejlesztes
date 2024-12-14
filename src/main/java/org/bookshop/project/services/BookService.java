package org.bookshop.project.services;

import org.bookshop.project.entities.Book;

public class BookService {
    //only the admins has right to use these functions
    public Book updateBook(Long bookId) {
        return null;
    }

    public Book addBook(Long bookId) {
        return null;
    }

    public Book deleteBook(Long bookId) {
        return null;
    }

    //user can use these:
    // Page<Book> getFilteredBook()
    //boolean isBookAvailable(Long bookId)
    //Book getBook(Long bookId)
}
