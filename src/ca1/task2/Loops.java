package ca1.task2;

public class Loops {
	public void printWords(int numberOfTimes) {
		for(int x = 0; x < numberOfTimes; x++)
			System.out.println("words");
	}
	
	public static void main(String[] args) {
		Loops loops = new Loops();
		loops.printWords(10);
	}
}
