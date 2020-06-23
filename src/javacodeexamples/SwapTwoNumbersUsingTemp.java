package javacodeexamples;

import java.util.Scanner;

public class SwapTwoNumbersUsingTemp{
	
	public static void main(String[] args) {
		// Create a scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers:");
		
		// get the int values from the console
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		
		//Swap numbers using temp variable
		
		int temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("Values after Swap using temp variable");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	 
}