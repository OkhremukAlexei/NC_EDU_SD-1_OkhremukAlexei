package com.edu.models;

import java.util.List;

public class User {

    private int idUser;
    private String userName;
    private String password;
    private String role;
    private List<Booking> bookings;

    public User(){

    }

    public User(int idUser, String userName, String password, String role, List<Booking> bookings){
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.bookings = bookings;
    }

    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }


    @Override
    public String toString() {
        return "ID : " + idUser +
                ", Username: " + userName +
                ", Password: " + password +
                ", Role: " + role;
    }
}

