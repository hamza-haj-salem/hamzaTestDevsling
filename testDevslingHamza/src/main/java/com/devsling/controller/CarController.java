package com.devsling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsling.entities.Car;
import com.devsling.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	
	
	
	    private final CarService carService;

	    @Autowired
	    public CarController(CarService carService) {
	        this.carService = carService;
	    }

	    @PostMapping
	    public ResponseEntity<Car> addCar(@RequestBody Car car) {
	        Car savedCar = carService.addCar(car);
	        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
	    }
	    
	


}
