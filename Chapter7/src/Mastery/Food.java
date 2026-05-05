package Mastery;

/* * 
Program: Food.java          Last Date of this Revision: 5/4/2026

Purpose:* Food class stores nutritional information for a single food item.

Author: Abdul Asim, 
School: CHHS
Course: Computer Programming 20
 */
public class Food {

    // Attributes for the food items
    private double price;
    private int fat;
    private int carbs;
    private int fiber;

    // Constructor - Initializes the fields
    public Food(double itemPrice, int itemFat, int itemCarbs, int itemFiber) {
        // Basic check to make sure price isn't negative
        if (itemPrice < 0) {
            price = 0.0;
        } else {
            price = itemPrice;
        }
        
        fat = itemFat;
        carbs = itemCarbs;
        fiber = itemFiber;
    }

    // Returns the cost of the item
    public double getPrice() {
        return price;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFiber() {
        return fiber;
    }

    /**
     * Calculates calories using the 9-4-4 rule.
     * Note: fiber is a carb but often subtracted or handled differently,
     * but for this level we'll just use total carbs.
     */
    public int getCalories() {
        int totalCal = (fat * 9) + (carbs * 4);
        return totalCal;
    }

    public static void main(String[] args) {
        // Create a new instance to test
        Food lunch = new Food(8.95, 12, 35, 5);
        
        System.out.println("--- Item Summary ---");
        System.out.println("Price: $" + lunch.getPrice());
        System.out.println("Nutrition: " + lunch.getFat() + "g Fat / " + lunch.getCarbs() + "g Carbs");
        System.out.println("Total Calories: " + lunch.getCalories());
    }
}


/* Screen Dump
--- Item Summary ---
Price: $8.95
Nutrition: 12g Fat / 35g Carbs
Total Calories: 248


 */