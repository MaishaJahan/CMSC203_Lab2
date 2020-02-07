import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
// Task #3
public class NumericTypes {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		int score1, score2, fahrenheit;
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		final int NUMBER = 2; // number of scores
		String output; // line of output to print out
		
		System.out.println("Enter Score #1 : ");
		score1 = input.nextInt();
		
		System.out.println("Enter Score #2 : ");
		score2 = input.nextInt();
		
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		fahrenheit = 212; // boiling temperature
		fToC = (5.0/9.0) * (fahrenheit - 32);
		output = fahrenheit + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Enter a number in fahrenheit: ");
		fahrenheit = input.nextInt();
		fToC = (5.0/9.0) * (fahrenheit - 32);
		output = fahrenheit + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
