/**
*
* @author Arthur Smith
* Date: 2/25/2015
* Contact: ags2739@email.vccs.edu
* Purpose: Prompts the user to input 5 numbers, calculates the sum
* and the average, and then returns the results to the user.
*/
import java.util.Scanner;
public class Assignment2 {
	public static void main (String[] args){
		//initializes five doubles for storing the user inputted
		// numbers, and two doubles for holding the sum and average.
		double number1, number2, number3, number4, number5, sum, average;
		Scanner keyboard = new Scanner(System.in);

		//prompts the user to input 5 numbers
		System.out.println("Enter five numbers on a line.\n");
		
		number1 = keyboard.nextDouble();
		number2 = keyboard.nextDouble();
		number3 = keyboard.nextDouble();
		number4 = keyboard.nextDouble();
		number5 = keyboard.nextDouble();

		//Calculates the sum and average and returns them to the user

		sum = (number1 + number2 + number3 + number4 + number5);
		average = (sum / 5);
		System.out.printf("\nThe sum is: %1.2f", sum);
		System.out.printf("\nThe average is: %1.2f", average);

		keyboard.close();
	}
}
