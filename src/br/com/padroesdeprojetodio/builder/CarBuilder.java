package br.com.padroesdeprojetodio.builder;

public class CarBuilder implements IVehicle {
    private Car car;
    
	public CarBuilder() {
		this.car = new Car();
	}
	
	public CarBuilder reset() {
		this.car = new Car();
		return this;
	}
	
	@Override
	public CarBuilder setCarType(String type) {
		this.car.setType(type);
		return this;
	}
	@Override
	public CarBuilder setColor(String color) {
		this.car.setColor(color);
		return this;
	}
	@Override
	public CarBuilder setSeats(int seats) {
		this.car.setSeats(seats);
		return this;
	}
	@Override
	public CarBuilder setEngine(Engine engine) {
		this.car.setEngine(engine);
		return this;
	}
	@Override
	public CarBuilder setRimWheels(int rimWheels) {
		this.car.setRimWheels(rimWheels);
		return this;
	}
	@Override
	public CarBuilder setTransmission(String transmission) {
		this.car.setTransmission(transmission);
		return this;
	}
	@Override
	public CarBuilder setTripComputer(String tripComputer) {
		this.car.setTripComputer(tripComputer);
		return this;
	}
    
    public Car build() {
        return car;
    }

}
