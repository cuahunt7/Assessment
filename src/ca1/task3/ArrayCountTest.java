package ca1.task3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayCountTest{
	
	String[] array;
	
	@BeforeEach
	void setUp() throws Exception {
		array = new String[] {"apple",
				"banana", "banana",
				"crab", "crab", "crab"};
	}
	
	// 1 occurence
	@Test
	void testCountOneOccurence() {
		ArrayCount ac = new ArrayCount();
		String testString = "apple";
		
		assertEquals(1, ac.count(array, testString));
	}
	
	
	// Many occurence
	@Test
	void testCountMultipleOccurence() {
		ArrayCount ac = new ArrayCount();
		String testString = "banana";
		
		assertEquals(2, ac.count(array, testString));
	}
	
	// No occurence
	@Test
	void testCountNoOccurence() {
		ArrayCount ac = new ArrayCount();
		String testString = "orange";
		
		assertEquals(0, ac.count(array, testString));
	}
	
}