package ca1.task4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
	
	public static final String EXPECTED_MAKE = "Honda";
    public static final String EXPECTED_MODEL = "Civic";
    public static final String EXPECTED_COLOR = "Red";
    public static final String EXPECTED_TO_STRING = "Honda, Civic, Red";
    
    private Car car;
    
    @BeforeEach
    public void setUp() throws Exception {
    	car = new Car("Honda", "Civic", "Red");
    }
    
    @Test
    public void testCarDetails() throws Exception {
        assertEquals(EXPECTED_MAKE, car.getMake());
        assertEquals(EXPECTED_MODEL, car.getModel());
        assertEquals(EXPECTED_COLOR, car.getColor());
    }
    
    @Test
    public void testToString() throws Exception {
        assertEquals(EXPECTED_TO_STRING, car.toString());
    }
    
    @Test
    public void testCarComparison() throws Exception {
    	Car car2 = new Car("Honda", "Civic", "Red");
    	assertTrue(car.equals(car2));
    }
}
