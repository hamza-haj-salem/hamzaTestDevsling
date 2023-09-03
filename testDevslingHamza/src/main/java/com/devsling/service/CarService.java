package com.devsling.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsling.entities.Car;
import com.devsling.repository.CarRepository;

@Service
public class CarService {
	
	    private final CarRepository carRepository;

	    @Autowired
	    public CarService(CarRepository carRepository) {
	        this.carRepository = carRepository;
	    }

	    public Car addCar(Car car) {
	        if (car.getRegistrationDate().isAfter(LocalDate.of(2015, 1, 1))) {
	            return carRepository.save(car);
	        } else {
	            throw new IllegalArgumentException("Only cars registered after 2015 are allowed.");
	        }
	    }
	    
}
