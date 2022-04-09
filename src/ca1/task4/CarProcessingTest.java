package ca1.task4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarProcessingTest {
	
	private CarProcessing cp;
	private Car[] cars = { 
			new Car("Honda", "Civic", "Red"),
			new Car("Holden", "Civic", "Red"),
			new Car("Jeep", "Wrangler", "Blue"),
			new Car("Jeep", "Wrangler", "Green"),
			new Car("Holden", "Falcon", "Yellow"),
			new Car("Honda", "Civic", "Blue"),
			new Car("Honda", "Falcon", "Blue"),
			new Car("Honda", "Civic", "Purple")
	};
	
	private final int EXPECTED_CAR_COUNT = 6;
	
	@BeforeEach
    public void setUp() throws Exception {
		cp = new CarProcessing();
    }
	
	@Test
    public void testCarRemoveDuplicate() throws Exception {
        assertEquals(EXPECTED_CAR_COUNT, cp.removeDuplicates(cars).length);
    }
	    
}
