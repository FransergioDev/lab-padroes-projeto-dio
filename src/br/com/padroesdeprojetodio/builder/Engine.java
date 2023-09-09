package br.com.padroesdeprojetodio.builder;

public class Engine {
	private String type;
	private String name;
	private String power;
	private String fuel;
	private float consumptionPerLiter;
	private String manufacturer;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public float getConsumptionPerLiter() {
		return consumptionPerLiter;
	}
	public void setConsumptionPerLiter(float consumptionPerLiter) {
		this.consumptionPerLiter = consumptionPerLiter;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
