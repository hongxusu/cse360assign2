package cse360assign2;
public class test {

	public static void main (String [] args) {
		
		AddingMachine myCoculator = new AddingMachine();
		
		myCoculator.add(4);
		myCoculator.subtract(2);
		myCoculator.add(5);
		System.out.printf( myCoculator.toString());
		
		
	}
	
}
