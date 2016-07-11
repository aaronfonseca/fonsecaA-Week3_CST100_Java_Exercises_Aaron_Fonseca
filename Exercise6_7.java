/** Program: Exercise 6.7
* File: Exercise6_7.java
* 
* Summary: (Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number
of years.

* Author: Aaron Fonseca
* Date: July 10, 2016
**/

import java.util.Scanner;

public class Exercise6_7 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Get investment amount
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        
        // Get Annual interest rate
        System.out.print("Enter Annual interest rate: ");
        double annualInterestRate = input.nextDouble() / 100;
        
        // Get Number of years
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        System.out.printf("%3s%15s\n", "Years", "Future Value");
        
        for (int i = 1; i <= years; i++) 
        {
            System.out.printf("%-4d%15.2f\n", i, futureInvestmentValue(investmentAmount, annualInterestRate / 12, i));
        }
	}
        
        public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) 
        {
		    return investmentAmount *  Math.pow((1 + monthlyInterestRate), (years * 12));
		}
	}


