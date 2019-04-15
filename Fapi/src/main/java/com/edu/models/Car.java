package com.edu.models;

public class Car {
    private int idCar;
    private String status;
    private int mileage;
    private String transmission;
    private String supplier;
    private String engineType;
    private String classCar;
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

    @Override
    public String toString() {
        return  "";
    }
}

