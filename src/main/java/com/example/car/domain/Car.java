package com.example.car.domain;

public class Car {
	
	private Integer  id;

	private Integer doors;
	
	private String colour;
	
	private Double engineSize;
	
	private Boolean manual;

	public Car() {
		super();
	}
	
	public Car(Integer id, Integer doors, String colour, Double engineSize, Boolean manual) {
		super();
		this.id = id;
		this.doors = doors;
		this.colour = colour;
		this.engineSize = engineSize;
		this.manual = manual;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDoors() {
		return doors;
	}

	public void setDoors(Integer doors) {
		this.doors = doors;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(Double engineSize) {
		this.engineSize = engineSize;
	}

	public Boolean getManual() {
		return manual;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", colour=" + colour + ", engineSize=" + engineSize + ", manual=" + manual + "]";
	}
	
	
	
}
