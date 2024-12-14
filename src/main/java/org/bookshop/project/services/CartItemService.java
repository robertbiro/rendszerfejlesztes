package org.bookshop.project.services;

import org.bookshop.project.entities.Book;

public class CartItemService {

    /**
     * The user can get information how many books are in the cart.
     */
    public Integer getCurrentBookQuantityOfUser(Long bookId, Long userId) {
        return null;
    }

    /**
     * The user can get increase the quantity of same books in the cart.
     */
    public Book increaseCartItemQuantityByButton(Long bookId, Long userId) {
        return null;
    }

    /**
     * The user can get decrease the quantity of same books in the cart.
     */
    public Book decreaseCartItemQuantityByButton(Long bookId, Long userId) {
        return null;
    }
}
