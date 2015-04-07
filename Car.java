
public class Car {
	
	//instance variables
	
	private String color;
	private double horsePower;
	private String engineSize;
	private String maker;
	
	//constructors
	
	public Car() {
		this.color = "white";
		this.horsePower = 100;
		this.engineSize = "V6";
		this.maker = "Generic Motors";
	}
	
	public Car (String color, double horsePower, String engineSize, String maker) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.maker = maker;
	}
	
	//methods
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setHorsePower (double horsePower) {
		this.horsePower = horsePower;
	}
	
	public Double getHorsePower() {
		return this.horsePower;
	}
	
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	
	public String getEngineSize() {
		return this.engineSize;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return this.maker;
	}
	
	public String toString() {
		return "The car's color is " + this.color + ", the horsepower is " + this.horsePower
				+ ", the engine size is " + this.engineSize + ", and the maker is " + this.maker + ".";
 	}
}
