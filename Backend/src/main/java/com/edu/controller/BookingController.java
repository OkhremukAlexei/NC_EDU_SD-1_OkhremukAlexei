package com.edu.controller;

import com.edu.entity.Booking;
import com.edu.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping(path="/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping(path="/add/")
    public @ResponseBody
    String addNewBooking () {
        Booking booking = new Booking();
        booking.setDate(new Date());
        return "Saved";
    }

    @GetMapping(path = "/all/")
    public @ResponseBody
    Iterable getAllBookings() {
        return bookingService.findAll();
    }

    @GetMapping(path = "/getById/")
    public @ResponseBody
    Optional<Booking> getUserById(@RequestParam  int idBooking){
        return bookingService.findById(idBooking);
    }

    @DeleteMapping(path = "/delete/")
    public @ResponseBody
    void deleteById(@RequestParam int idBooking){
        bookingService.delete(idBooking);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Booking saveUser(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }
}
