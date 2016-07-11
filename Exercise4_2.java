/** Program: Exercise 4.2
* File: Exercise4_2.java
* Summary: (Geometry: great circle distance)
* Author: Aaron Fonseca
* Date: June 25, 2016
**/

import java.util.Scanner;

public class Exercise4_2 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
			String point1 = input.nextLine();
			System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
			String point2 = input.nextLine();

			int a = point1.indexOf(',');
			double x1 = Double.parseDouble(point1.substring(0, a - 1));
			double y1 = Double.parseDouble(point1.substring(a + 2));
			
			a = point2.indexOf(',');
			double x2 = Double.parseDouble(point2.substring(0, a - 1));
			double y2 = Double.parseDouble(point2.substring(a + 2));

			// Convert degrees to radians
			x1 = Math.toRadians(x1);
			y1 = Math.toRadians(y1);
			x2 = Math.toRadians(x2);
			y2 = Math.toRadians(y2);
			
			double radius = 6371.01;
			double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
			distance = Math.round(distance * 100) / 100.0; //Round to two decimals

			System.out.println("The distance between the two points is " + distance + "km");
		}
	}