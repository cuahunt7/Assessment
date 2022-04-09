package ca1.task4;

	//Creating Car Class
public class Car {
	private String make;
	private String model;
	private String color;
	
	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	// Implemented getter and setter to the field so we can access it outside the class
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean equals(Car car2) {
		// will return true if two car object is equal to the second car model and color
		return getModel().equals(car2.getModel()) && getColor().equals(car2.getColor());
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s", getMake(), getModel(), getColor());
	}
}
