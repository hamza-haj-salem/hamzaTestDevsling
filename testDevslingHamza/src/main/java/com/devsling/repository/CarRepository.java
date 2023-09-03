 package com.devsling.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsling.entities.Car;
import com.devsling.entities.FuelType;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	List<Car> findByRegistrationDateAfterAndPriceLessThanEqualAndFuelType(LocalDate registrationDate, double maxPrice, FuelType fuelType);
    List<String> findDistinctMake();

}
