package javacodeexamples;

import java.util.Scanner;

public class SwapTwoNumbersWithoutTemp{
	
	public static void main(String[] args) {
		// Create a scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers:");
		
		// get the int values from the console
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		
		//Swap numbers without temp variable
		
		int temp = a;
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("Values after Swap without temp variable");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	 
}