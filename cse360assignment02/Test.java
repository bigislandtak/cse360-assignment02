import cse360assignment02.AddingMachine;

import java.io.*;

public class Test {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract (2); 
		myCalculator.add(5);
		myCalculator.add(6);
		myCalculator.subtract(3);

		System.out.println(myCalculator.toString() + "= " + myCalculator.getTotal());
	}
}