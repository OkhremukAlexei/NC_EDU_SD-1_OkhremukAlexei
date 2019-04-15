package com.edu.service.Impl;

import com.edu.entity.Car;
import com.edu.repository.CarRepository;
import com.edu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository cars;
    @Override
    public Iterable<Car> findAll() {
        return cars.findAll();
    }

    @Override
    public Optional<Car> findById(int idCar) {
        return cars.findById(idCar);
    }

    @Override
    public Car save(Car car) {
        return cars.save(car);
    }

    @Override
    public void delete(int idCar) {
        cars.deleteById(idCar);
    }
}
