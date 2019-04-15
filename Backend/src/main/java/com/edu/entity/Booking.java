package com.edu.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "id_booking")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idBooking;

    @Column(name = "date")
    private Date date;

    @Column(name = "cost")
    private int cost;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private List<User> users;

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
}
