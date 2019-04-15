package com.edu.service;

import com.edu.entity.Car;
import java.util.Optional;

public interface CarService {
    Iterable<Car> findAll();
    Optional<Car> findById(int idCar);
    Car save(Car car);
    void delete(int idCar);
}
