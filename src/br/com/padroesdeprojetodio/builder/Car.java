package br.com.padroesdeprojetodio.builder;

public class Car {
    private String type;
    private String color;
    private int seats;
    private Engine engine;
    private String transmission;
    private String tripComputer;
    private int rimWheels;
    
    
    
	public Car() {}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getTripComputer() {
		return tripComputer;
	}
	public void setTripComputer(String tripComputer) {
		this.tripComputer = tripComputer;
	}
	public int getRimWheels() {
		return rimWheels;
	}
	public void setRimWheels(int rimWheels) {
		this.rimWheels = rimWheels;
	}
	
	@Override
	public String toString() {
		return this.getType() + " - " + this.getColor() + " - " + this.getEngine().getName();
	}

}
