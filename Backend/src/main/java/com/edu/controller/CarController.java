package com.edu.controller;

import com.edu.entity.Car;
import com.edu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(path="/add/")
    public @ResponseBody
    String addNewCar (@RequestParam String status, @RequestParam int mileage,
                      @RequestParam String transmission, @RequestParam String supplier,
                      @RequestParam String engineType, @RequestParam String classCar,
                      @RequestParam boolean hasConditioner) {
        Car car = new Car();
        car.setStatus(status);
        car.setMileage(mileage);
        car.setTransmission(transmission);
        car.setSupplier(supplier);
        car.setEngineType(engineType);
        car.setClassCar(classCar);
        car.setHasConditioner(hasConditioner);
        carService.save(car);
        return "Saved";
    }

    @GetMapping(path = "/all/")
    public @ResponseBody
    Iterable getAllCar() {
        return carService.findAll();
    }

    @GetMapping(path = "/getById/")
    public @ResponseBody
    Optional<Car> getUserById(@RequestParam  int id){
        return carService.findById(id);
    }

    @DeleteMapping(path = "/delete/")
    public @ResponseBody
    void deleteById(@RequestParam int idCar){
        carService.delete(idCar);
    }

    @PostMapping
    public Car saveCar(@RequestBody Car car) {
        return carService.save(car);
    }
}
