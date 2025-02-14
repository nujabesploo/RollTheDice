// Declares the package name
package com.pluralsight;

// Main class definition
public class Main {
    // Main method - program entry point
    public static void main(String[] args) {
        // Initialize variables to store dice rolls and counters
        int rollOne;
        int rollTwo;
        int sum;

        // Initialize counters for different sums
        int twoCount = 0;
        int fourCount = 0;
        int sixCount = 0;
        int sevenCount = 0;

        // Create new instance of Dice class
        Dice dice = new Dice();

        // Loop 100 times to simulate dice rolls
        for(int i = 0; i < 100; i++) {
            // Roll both dice and calculate sum
            rollOne = dice.roll();
            rollTwo = dice.roll();
            sum = rollOne + rollTwo;

            // Count occurrences of specific sums
            switch(sum) {
                case 2:
                    twoCount++;
                    break;
                case 4:
                    fourCount++;
                    break;
                case 6:
                    sixCount++;
                    break;
                case 7:
                    sevenCount++;
                    break;
            }

            // Display each roll result
            System.out.printf("Roll %d: %d + %d = %d%n",
                    i + 1, rollOne, rollTwo, sum);
        }

        // Display final statistics
        System.out.println("\nFinal Statistics:");
        System.out.printf("Sum of 2: %d times%n", twoCount);
        System.out.printf("Sum of 4: %d times%n", fourCount);
        System.out.printf("Sum of 6: %d times%n", sixCount);
        System.out.printf("Sum of 7: %d times%n", sevenCount);
    }
}