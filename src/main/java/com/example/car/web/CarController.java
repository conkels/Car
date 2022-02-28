package com.example.car.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.domain.Car;
import com.example.car.service.CarService;

@RestController
public class CarController {
	
	private CarService service;
	
	@Autowired
	public CarController(CarService service) {
		super();
		this.service=service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Car> createCar(@RequestBody Car c) {
		Car created = this.service.createCar(c);
		ResponseEntity<Car> response = new ResponseEntity<Car>(created, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Car>> getAllCars() {
		return ResponseEntity.ok(this.service.getAllCars());
	}
	
	@GetMapping("/get/{id}")
	public Car getCar(@PathVariable Integer id) {
		return this.service.getCar(id);
	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Car> replaceCar(@PathVariable Integer id, @RequestBody Car newCar) {
		Car body = this.service.replaceCar(id, newCar);
		ResponseEntity<Car> response = new ResponseEntity<Car>(body, HttpStatus.ACCEPTED);
		return response;
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeCar(@PathVariable Integer id) {
		this.service.removeCar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
