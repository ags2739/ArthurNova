import java.util.Scanner;


public class CalculatorDriver {

	public static void main(String[] args) {
		
		double number [] = new double [3];
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("This program will output the average, sum, and product of a user inputted array.");
		System.out.println ("Enter a number for the first number in the array.");
		number[0] = keyboard.nextDouble();
		System.out.println ("Enter a number for the second number in the array.");
		number[1] = keyboard.nextDouble();
		System.out.println ("Enter a number for the third number in the array.");
		number[2] = keyboard.nextDouble();
		
		
		System.out.println("The average of the numbers in the array is " +Calculator.getAverage(number));
		System.out.println("The sum of the numbers in the array is " + Calculator.getSum(number));
		System.out.println("The product of the numbers in the array is " + Calculator.getProduct(number));

		keyboard.close();
	}

}
