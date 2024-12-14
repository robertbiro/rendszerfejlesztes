package org.bookshop.project.entities;

public class CartItem {

    private Integer bookId;
    private Integer quantity;
    private Cart cart;

    //many cartItem belong to one cart: manyToOne connection
}
