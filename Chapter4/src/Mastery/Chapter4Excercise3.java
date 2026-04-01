/*

Program: excercise1.java          Last Date of this Revision:4/1/2026

Purpose:  To find the cost of eggs

Author: Abdul Asim
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class Chapter4Excercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for number of eggs
        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();

        // Calculate dozens and extra eggs
        int dozens = eggs / 12;
        int extraEggs = eggs % 12;
        double pricePerDozen;

        // Determine price per dozen
        if (dozens < 4) {
            pricePerDozen = 0.50;
        } else if (dozens < 6) {
            pricePerDozen = 0.45;
        } else if (dozens < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        // Calculate total bill
        double total = (dozens * pricePerDozen) + (extraEggs * (pricePerDozen / 12));

        // Display the bill
        System.out.printf("The bill is equal to $%.2f%n", total);

        input.close();
    }
}


/* Screen Dump
Enter the number of eggs purchased: 6
The bill is equal to $0.25
*/