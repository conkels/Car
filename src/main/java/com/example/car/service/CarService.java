package com.example.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.car.domain.Car;

@Service
public class CarService {

	private List<Car> garage = new ArrayList<>();
	
	public Car createCar(Car c) {
		this.garage.add(c);
		Car created = this.garage.get(this.garage.size() - 1);
		return created;
	}
	
	public List<Car> getAllCars() {
		return this.garage;
	}
	
	public Car getCar(Integer id) {
		return this.garage.get(id);
	}
	
	public Car replaceCar(Integer id, Car newCar) {
		Car body = this.garage.set(id, newCar);
		return body;
	}
	
	public void removeCar(@PathVariable Integer id) {
		this.garage.remove(id.intValue());
	}
}
