/** Program: Exercise 4.11
* File: Exercise4_11.java
* Summary: (Decimal to hex)
* Author: Aaron Fonseca
* Date: July 6, 2016
**/

import java.util.Scanner;

public class Exercise4_11 {

	public static void main(String[] args) {

		 // Create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        input.close();
        
        // Find hex number for int number
		if (number >= 0 && number <= 9)
		{
			System.out.println("The hex value is " + number);
		} else if (number >= 10 && number <= 15)
		{
			System.out.println("The hex value is " + (char)(number + 'A' - 10));
		}
		else 
		{
			System.out.println(number + " is an invalid input");
		}
	}

}
