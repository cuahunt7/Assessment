package ca1.task1;

public class CaesarCypher {
	
	
	//autoboxing
	private static final int START_INDEX = 'a'; //97
	private static final int END_INDEX = 'z'; //122
	
	public char[] encode(char[] input, int offset) {
		// creates a new out array depending on input variable length
		char[] output = new char[input.length];
		int index = 0; //checker
		for(char c : input) {
			if((c + offset) > END_INDEX) {
				int buffer = (c + offset) - END_INDEX;
				output[index++] = (char) (START_INDEX + buffer - 1);
			} else {
				output[index++] = (char) (c + offset);
			}
		}
		return output;
	}
	
	public char[] decode(char[] input, int offset) {
		char[] output = new char[input.length];
		int index = 0;
		for(char c : input) {
			if((c - offset) < START_INDEX) {
				int buffer = START_INDEX - (c - offset);
				output[index++] = (char) (END_INDEX - buffer + 1);
			} else {
				output[index++] = (char) (c - offset);
			}
		}
		return output;
	}
	void output (char[] input) {
		for(char c : input) {
			System.out.print(c + " ");
		}
	}
	
	
	public static void main(String [] args) {
		CaesarCypher cc = new CaesarCypher();
		
		char[] input = {'a', 'b', 'c'};
		char[] out = cc.decode(input, 1);
		cc.output(out);
		
	}
	
	
	
}


