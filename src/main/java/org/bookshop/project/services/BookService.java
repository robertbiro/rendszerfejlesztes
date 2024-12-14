package org.bookshop.project.services;

import org.bookshop.project.entities.Book;

import java.util.HashMap;
import java.util.Map;

public class BookService {
    //only the admins has right to use these functions
    //only for the task description, it will not be the part of the final code:
    private final Map<Long, Book> books = new HashMap<>();

    public Book addBook(Long bookId) {
        Book book = new Book();
        book.setId(bookId);
        book.setTitle("Default Title");
        book.setAuthor("Default Author");
        books.put(bookId, book);
        return book;
    }

    public Book updateBook(Long bookId) {
        Book book = books.get(bookId);
        if (book != null) {
            Book updatedBook = new Book();
            updatedBook.setId(bookId);
            updatedBook.setTitle(book.getTitle() + " (Updated)");
            updatedBook.setAuthor(book.getAuthor() + " (Updated)");
            books.put(bookId, updatedBook);
            return updatedBook;
        }
        return null;
    }

    public Book deleteBook(Long bookId) {
        return books.remove(bookId);
    }

    //user can use these:
    // Page<Book> getFilteredBook()
    //boolean isBookAvailable(Long bookId)
    //Book getBook(Long bookId)
}
