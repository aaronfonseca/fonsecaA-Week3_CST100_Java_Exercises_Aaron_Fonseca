/** Program: Exercise 4.23
* File: Exercise4_23.java
* Summary: (Financial application: payroll)
* Author: Aaron Fonseca
* Date: July 6, 2016
**/

import java.util.Scanner;

public class Exercise4_23 {

	public static void main(String[] args) {

		 // Create scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        
        System.out.print("Enter hourly pay rate: ");
        float payRate = input.nextFloat();
        
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        input.close();
        
        double grossPay = (hours * payRate);
        double federalWitholding = federalTax * 100;
        double federalWitholdingCash = grossPay * federalTax;
        String federal = String.format("%.2f", federalWitholdingCash);
        double stateWitholding = stateTax * 100;
        double stateWitholdingCash = grossPay * stateTax;
        
        System.out.print("Employee Name: " + name +"\n");
        System.out.print("Hours Worked: " + hours +"\n");
        System.out.print("Pay Rate: $" + payRate + "\n");
        System.out.print("Gross Pay: $" + grossPay +"\n");
        System.out.print("Deductions:\n");
        System.out.print("\tFederal Withholding (" + federalWitholding + "%): $" + federal + "\n");
        System.out.print("\tState Withholding (" + stateWitholding + "%): $" + stateWitholdingCash + "\n");
        System.out.print("\tTotal Deduction: $" + (federalWitholdingCash + stateWitholdingCash) + "\n");
        System.out.print("Net Pay: $" + (grossPay - (federalWitholdingCash + stateWitholdingCash)) + "\n");
	}

}
