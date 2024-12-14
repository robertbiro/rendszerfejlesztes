package org.bookshop.project.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private ApplicationUser applicationUser;
    private List<CartItem> booksInCart = new ArrayList<>();

    //One Cart has many CartItem:OneToMany connection
}
