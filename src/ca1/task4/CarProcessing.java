package ca1.task4;

import java.util.ArrayList;
import java.util.List;

public class CarProcessing {
	public static void main(String[] args) {
		
		CarProcessing cp = new CarProcessing();
		
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};
		
		Car[] noDuplicates = cp.removeDuplicates(cars);
		System.out.println(noDuplicates.length);
		for(Car c : noDuplicates ) {
			System.out.println(c);
		}
	}
	
	public Car[] removeDuplicates(Car[] inputArray) {
		List<Car> carList = new ArrayList<>();
		for(int x = 0; x < inputArray.length; x++) {
			boolean equal = false;
			for(int j = 0; j < inputArray.length; j++) {
				if(x != j && inputArray[x].equals(inputArray[j])) {
					equal = true;
					break;
				}
			}
			if(!equal) carList.add(inputArray[x]);
		}
		// convert carList Arraylist object to Car[] array
		return carList.toArray(Car[]::new);
	}
	
}
