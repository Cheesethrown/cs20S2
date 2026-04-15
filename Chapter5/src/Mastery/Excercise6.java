package Mastery;

/*
Program: Excercise6.java          Last Date of this Revision: 4/15/2026

Purpose: To calculate the sum of the digits of a user-inputted integer.

Author: Abdul Asim
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Setup variables
        int number;
        int sum = 0;
        
        // Prompt user
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
        
        // We use a while loop to process each digit
        // The loop continues until the number is "emptied" out
        while (number > 0) {
            // Step 1: Get the right-most digit using modulo (%)
            int digit = number % 10;
            
            // Step 2: Add that digit to our total sum
            sum = sum + digit;
            
            // Step 3: Remove the right-most digit using integer division (/)
            number = number / 10;
        }
        
        // Final display
        System.out.println("The sum of the digits is: " + sum);
        
        // Close the scanner
        input.close();
    }
}

/* Screen Dump
Enter a positive integer: 892
The sum of the digits is: 19
*/
