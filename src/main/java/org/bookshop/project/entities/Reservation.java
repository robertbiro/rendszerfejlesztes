package org.bookshop.project.entities;

import java.time.LocalDateTime;

public class Reservation {

    private ApplicationUser applicationUser;
    private Book book;
    private LocalDateTime createdAt;

    //many reservation belong to one user
    //many reservation belong to one book

}
