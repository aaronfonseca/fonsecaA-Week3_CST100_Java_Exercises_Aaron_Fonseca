/** Program: Exercise 6.12
* File: Exercise6_12.java
* 
* Summary: (Display characters) Write a test program that prints ten characters per line from 1 to Z.
Characters are separated by exactly one space.
* Author: Aaron Fonseca
* Date: July 10, 2016
**/


public class Exercise6_12 {

	// Using method prints ten characters per line from 1 to Z
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (int i = 1; ch1 <= ch2; i++) {
            System.out.print(ch1 + " ");
            if (i % numberPerLine == 0) System.out.println("");
            ch1++;
        }

    }
}