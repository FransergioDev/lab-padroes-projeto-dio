package br.com.padroesdeprojetodio.builder;

public interface IVehicle {
	CarBuilder setCarType(String type);
	CarBuilder setColor(String color);
	CarBuilder setSeats(int seats);
	CarBuilder setEngine(Engine engine);
	CarBuilder setRimWheels(int rimWheels);
	CarBuilder setTransmission(String transmission);
	CarBuilder setTripComputer(String tripComputer);
}
