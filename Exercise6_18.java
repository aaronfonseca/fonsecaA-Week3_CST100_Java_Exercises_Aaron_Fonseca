/** Program: Exercise 6.18
* File: Exercise6_18.java
* Summary: Check password) Write a method that checks whether a string is a valid password. 
* Suppose the password rules are as follows:
* A password must have at least eight characters.
* A password consists of only letters and digits.
* A password must contain at least two digits.
* Author: Aaron Fonseca
* Date: July 10, 2016
**/

import java.util.Scanner;

public class Exercise6_18 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Get password
		System.out.println("A password must have at least eight characters.\n"
							+ "A password consists of only letters and digits.\n"
							+ "A password must contain at least two digits.");
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        input.close();
        String message = isValid(password);
        System.out.print(message);

	}

	private static String isValid(String password) {
		if (password.matches("^(?=.*?\\d.*\\d)(?=.*?[A-Za-z])[a-zA-Z0-9]{8,}$"))
		{
		return "Valid Password";
		} else 
			{
				return "Invalid Password";
			}
	}

}
