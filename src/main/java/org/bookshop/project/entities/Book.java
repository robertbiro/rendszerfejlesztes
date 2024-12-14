package org.bookshop.project.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private Long id;
    private String title;
    private String author;
    private String description;
    private String isbn;
    private double price;
    private String publishingDate;
    private String publishingPlace;
    private BookCategory bookCategory;
    private int stock;

    //One book belong to many Reservation:OneToMany connection
}
