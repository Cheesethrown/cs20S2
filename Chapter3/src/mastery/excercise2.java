/*

Program: excercise1.java          Last Date of this Revision:3/19/2026

Purpose:  an application to drop an object and see how many seconds it'll take to touch the ground

Author: Abdul Asim
School: CHHS
Course: Computer Programming 20
 

*/






package mastery;	

import java.util.Scanner;

public class excercise2 {

	public static void main(String[] args) {
		       Scanner input = new Scanner(System.in);

		        // Ask the user for the time
		        System.out.print("Enter the time in seconds thats less than 4.5: ");
		        double t = input.nextDouble();

		        // Check if the input is valid
		        if (t >= 4.5) {
		            System.out.println("Error: Time must be less than 4.5 seconds.");
		        } else {
		            // Calculate height using the formula h = 100 - 4.9 * t^2
		            double height = 100 - 4.9 * t * t;

		            // Display the result
		            System.out.printf("At %.2f seconds, the object is at a height of %.2f meters.\n", t, height);
		        }

		        input.close();
		    }
		


	}



/* Screen Dump

 Enter the time in seconds thats less than 4.5: 1
At 1.00 seconds, the object is at a height of 95.10 meters.

*/
