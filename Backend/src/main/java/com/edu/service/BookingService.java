package com.edu.service;

import com.edu.entity.Booking;
import java.util.Optional;

public interface BookingService {
    Iterable<Booking> findAll();
    Optional<Booking> findById(int idBooking);
    Booking save(Booking booking);
    void delete(int idBooking);
}
