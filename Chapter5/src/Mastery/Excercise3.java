package Mastery;

/*
Program: Excercise3.java          Last Date of this Revision: 4/15/2026

Purpose: To calculate the years required for an investment to double at 7.5% interest.

Author: Abdul Asim
School: CHHS
Course: Computer Programming 20
*/

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        // Variables for the calculation
        double money = 2500.0;
        double goal = 5000.0;
        double rate = 0.075; // 7.5% as a decimal
        int yearsPassed = 0;
        
        System.out.println("--- Investment Growth Calculator ---");
        System.out.println("Starting balance: $" + money);
        
        // Loop runs as long as we have less than $5000
        while (money < goal) {
            // Calculate how much they earn this year
            double interest = money * rate;
            
            // Add that interest to the total money
            money = money + interest;
            
            // Count this as one year gone by
            yearsPassed = yearsPassed + 1;
            
            // Print the update so the user sees the progress
            System.out.println("Year " + yearsPassed + ": $" + money);
        }
        
        // Final output message
        System.out.println("------------------------------------");
        System.out.println("It will take " + yearsPassed + " years to reach the goal.");
        System.out.println("Final amount: $" + money);
        
    } // Closes main
} // Closes class

/* Screen Dump
--- Investment Growth Calculator ---
Starting balance: $2500.0
Year 1: $2687.5
Year 2: $2889.0625
Year 3: $3105.7421875
Year 4: $3338.6728515625
Year 5: $3589.0733154296877
Year 6: $3858.253814086914
Year 7: $4147.6228501434325
Year 8: $4458.69456390419
Year 9: $4793.0966561970035
Year 10: $5152.578905411779
------------------------------------
It will take 10 years to reach the goal.
Final amount: $5152.578905411779

*/
