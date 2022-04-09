package ca1.task3;

public class ArrayCount {
	public int count(String[] array, String target) {
		int count = 0;
		for(String s : array) {
			if(target.equals(s)) count++;
		}
		return count;

	}	
	
}
