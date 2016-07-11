/** Program: Exercise 6.5
* File: Exercise6_5.java
* Summary: (Sort three numbers) Write a method with the following header to display three numbers in increasing order:
* Author: Aaron Fonseca
* Date: July 10, 2016
**/

import java.util.Scanner;

public class Exercise6_5 {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in); 

		// get three numbers from input
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		// Display numbers in increasing order
		displaySortedNumbers(number1, number2, number3);
	}

	// Sort Method, get three numbers in increasing order */
	public static void displaySortedNumbers(
		double number1, double number2, double number3) {
		double temp; // temp number to swap
		
		if (number2 < number1 && number2 < number3){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		else if (number3 < number1 && number3 < number2) {
			temp = number1; 
			number1 = number3;
			number3 = temp;
		}
		if (number3 < number2) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		// Display result
		System.out.println("The Numbers sorted in increasing number are " + number1 + " " + number2 + " " + number3);
	}
}