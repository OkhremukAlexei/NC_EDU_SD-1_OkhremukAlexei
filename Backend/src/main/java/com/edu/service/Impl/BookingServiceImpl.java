package com.edu.service.Impl;

import com.edu.entity.Booking;
import com.edu.repository.BookingRepository;
import com.edu.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookings;

    @Override
    public Iterable<Booking> findAll() {
        return bookings.findAll();
    }

    @Override
    public Optional<Booking> findById(int idBooking) {
        return bookings.findById(idBooking);
    }

    @Override
    public Booking save(Booking booking) {
        return bookings.save(booking);
    }

    @Override
    public void delete(int idBooking) {
        bookings.deleteById(idBooking);
    }
}
