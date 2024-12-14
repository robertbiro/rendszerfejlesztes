package org.bookshop.project.service.BookService;

import org.bookshop.project.entities.Book;
import org.bookshop.project.services.BookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    @Test
    void testAddBook() {
        BookService bookService = new BookService();
        Long bookId = 1L;

        Book addedBook = bookService.addBook(bookId);

        assertNotNull(addedBook);
        assertEquals(bookId, addedBook.getId());
        assertEquals("Default Title", addedBook.getTitle());
        assertEquals("Default Author", addedBook.getAuthor());
    }

    @Test
    void testUpdateBook() {
        BookService bookService = new BookService();
        Long bookId = 1L;
        bookService.addBook(bookId);

        Book updatedBook = bookService.updateBook(bookId);

        assertNotNull(updatedBook);
        assertEquals(bookId, updatedBook.getId());
        assertEquals("Default Title (Updated)", updatedBook.getTitle());
        assertEquals("Default Author (Updated)", updatedBook.getAuthor());
    }

    @Test
    void testDeleteBook() {
        BookService bookService = new BookService();
        Long bookId = 1L;
        bookService.addBook(bookId);

        Book deletedBook = bookService.deleteBook(bookId);

        assertNotNull(deletedBook);
        assertEquals(bookId, deletedBook.getId());
        assertEquals("Default Title", deletedBook.getTitle());
        assertEquals("Default Author", deletedBook.getAuthor());

        assertNull(bookService.deleteBook(bookId)); // Ellenőrzés, hogy már nem létezik
    }
}
