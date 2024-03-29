


//repository URL:
//https://github.com/hongxusu/cse360assign2/blob/master/cse360assign2/src/cse360assign2/AddingMachine.java



package cse360assign2; 

public class AddingMachine {

	private int total;
	
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		
		total = total + value; 
		
		history = history + " + " + value;
		
	}
	
	public void subtract (int value) {
		
		
		total = total - value;
		
		history = history + " - " + value;
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
		
		history = "0";
	
	}
}
