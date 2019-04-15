package com.edu.models;

import java.sql.Date;
import java.util.List;


public class Booking {
    private int idBooking;
    private Date date;
    private int cost;
    private List<User> users;

    public Booking() {}

    public Booking(int idBooking, Date date, int cost, List<User> users){
        this.idBooking = idBooking;
        this.date = date;
        this.cost = cost;
        this.users = users;
    }

    public int getIdBooking() {
        return idBooking;
    }
    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "ID: " + idBooking +
                ", Date: " + date +
                ", Cost: ";
    }
}

