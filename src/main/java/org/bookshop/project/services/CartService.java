package org.bookshop.project.services;

import org.bookshop.project.entities.Book;

import java.security.Principal;
import java.util.List;

public class CartService {

    /**
     * It is an automatic method ->
     * If user choose books it became a cartItem and it will add to the Cart.
     */
    public Book addBookToCart(Long userId) {
        return null;
    }

    /**
     * The user can delet his/her Cart.
     */
    void deleteCart() {

    }
    /**
     * User and admin can get the content of a Cart.
     */
    public List<Book> getCartContentByUser(Long UserId) {
        return null;
    }

}
