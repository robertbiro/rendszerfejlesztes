package org.bookshop.project.services;

import org.bookshop.project.entities.Book;
import org.bookshop.project.entities.Reservation;

import java.util.List;

public class ReservationService {
    /**
     * User can reserve a book which not exist in the storage.
     */
    public Book createReservation(Long bookId) {
        return null;
    }

    /**
     * The user and admin can get all reserved Book by a user
     */
    public List<Reservation> getAllReservedBooksByUser(Long UserId) {
        return null;
    }
}
