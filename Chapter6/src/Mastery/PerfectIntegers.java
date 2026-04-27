/*

Program: PerfectIntegers.java          Last Date of this Revision: 4/22/2026

Purpose:Create a PerfectIntegers application that displays all perfect integers up to 100

Author: Abdul Asim, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

public class PerfectIntegers {

    // Method that returns true if the number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Add all factors except the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // A perfect number is equal to the sum of its factors
        return sum == number;
    }

    public static void main(String[] args) {

        System.out.println("Perfect integers up to 100:");

        for (int i = 1; i <= 100; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}

/* Screen Dump

Perfect integers up to 100:
6
28

 
 */