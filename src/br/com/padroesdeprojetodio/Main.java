package br.com.padroesdeprojetodio;

import br.com.padroesdeprojetodio.builder.Car;
import br.com.padroesdeprojetodio.builder.CarBuilder;
import br.com.padroesdeprojetodio.builder.Engine;

public class Main {

	public static void main(String[] args) {
		CarBuilder carBuilder = new CarBuilder();
		Engine engineCar = new Engine();
		engineCar.setName("V8");
		engineCar.setType(null);
		engineCar.setFuel("diesel");
		
		Car pickUp = carBuilder.setCarType("pick-up").setColor("black").setEngine(engineCar).setRimWheels(20).setSeats(6).build();
		System.out.println(pickUp.toString());
	}
}
