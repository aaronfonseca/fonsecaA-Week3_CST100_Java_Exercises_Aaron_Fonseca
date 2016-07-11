/** Program: Exercise 6.31
* File: Exercise6_31.java
* Summary: (Financial: credit card number validation) Write a program that prompts the user to enter a credit card number as a long
integer. Display whether the number is valid or invalid.
* Author: Aaron Fonseca
* Date: July 10, 2016
**/

import java.util.Scanner;

public class Exercise6_31 {
	
	final static int Visa = 4;
	final static int Master = 5;
	final static int AmericanExpress = 37;
	final static int Discover = 6;

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
        long number = input.nextLong();
        input.close();
        
        if (isValid(number)) {
            System.out.println(number + " is valid.");
        } else {
            System.out.println(number + " is INVALID");
        }

	}

	/** Return true if the card number is valid */
	private static boolean isValid(long number) {
		
		// Check length of CardNumber 
		if( (getSize(number) > 16) || (getSize(number)  < 13) ){ 
			System.out.println("failed length");
			return false;
			}
		
		// Check for card type
		int firstDigit = Integer.parseInt(Long.toString(number).substring(0, 1)); // Get first digit of number
		int secondDigit = Integer.parseInt(Long.toString(number).substring(0, 2)); // Get first two digits of number
		if( (firstDigit == Visa) || (firstDigit == Master) || (secondDigit == AmericanExpress) || (firstDigit == Discover) )
		{ 
			if ( (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 )
			{
				return true;
			}
			else {
				return false;
			}
		} 
		return false;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number){
		int sum = 0;
		for(int i = 0; i < getSize(number); i++){
			if(i % 2 == 0) {
				// Get even digits of number
	        	int evenDigit = Integer.parseInt(Long.toString(number).substring(i, i+1)) * 2  ; 
	        	if (evenDigit > 9)
	        	{
	        		int temp1 = Integer.parseInt(Long.toString(evenDigit).substring(0, 1));
	        		int temp2 = Integer.parseInt(Long.toString(evenDigit).substring(1, 2));
	        		evenDigit = temp1 + temp2;
	        	}
	        	 sum += evenDigit;
			}
		}
		return sum;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfOddPlace(long number){
		int sum = 0;
		for(int i = 0; i < getSize(number); i++){
			if(i % 2 != 0) {
				// Get odd digits of number
	        	int oddDigit = Integer.parseInt(Long.toString(number).substring(i, i+1)); 
	        	sum += oddDigit;
			}
		}
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number){
		return number;
		
	}
	
	/** Return the number of digits in d */
	private static int getSize(long d){
		int length = Long.toString(d).length();
		return length;
	}
	
	
	

}
