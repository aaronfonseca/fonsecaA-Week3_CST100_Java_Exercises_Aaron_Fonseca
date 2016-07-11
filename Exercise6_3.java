/** Program: Exercise 6.3
* File: Exercise6_3.java
* Summary: (Palindrome integer) Write the methods with the following headers

// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.

* Author: Aaron Fonseca
* Date: July 10, 2016
**/


import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		
		// Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Get 3-digit integer
        System.out.println("Enter a three-digit integer to check if it is a palindrome:");
        int number = input.nextInt();
        
        // Check length of integer
        int length = Integer.toString(number).length();
        if (length == 3){
        	 String reverseNumber = reverse(number);
        	 System.out.println(number + " is a palindrome is " + isPalindrome(Integer.toString(number), reverseNumber));
        }
        else {
        	System.out.println("Invalid not a three-digit integer!");
        }
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static String reverse(int number) {
			String s1 = Integer.toString(number);
	    	StringBuffer s2 = new StringBuffer(s1);
	    	s2.reverse();
	    	String s3 = s2.toString();
		return s3;
	}
	
	// Return true if number is a palindrome
	public static boolean isPalindrome(String s1, String s2){
		if(s1.equals(s2.toString())){
			return true;
    	} else {
    		return false;
    	}		
	}
}
