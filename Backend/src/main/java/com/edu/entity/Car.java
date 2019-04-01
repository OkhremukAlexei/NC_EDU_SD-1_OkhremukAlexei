package com.edu.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id_car")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCar;

    @Column(name = "status")
    private String status;

    @Column(name = "mileage")
    private int mileage;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "class_car")
    private String classCar;

    @Column(name = "has_conditioner")
    private boolean hasConditioner;

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public boolean isHasConditioner() {
        return hasConditioner;
    }

    public void setHasConditioner(boolean hasConditioner) {
        this.hasConditioner = hasConditioner;
    }
}
