/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vu.babymealscheduler;
import java.util.Scanner;

public class BabyMealScheduler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PART (b): BABY'S MEAL SCHEDULING ===");
        System.out.println("Feeding Rules:");
        System.out.println("- Half cup of Aunt Porridge: feed again after 45 minutes");
        System.out.println("- Full cup of Lato Milk: feed again after 30 minutes");
        System.out.println("- Baby's cup: half liter (0.5L)");
        System.out.println("- Available: 2L porridge and 2L milk");
        
        // Constants from the problem
        final double CUP_CAPACITY = 0.5; // half liter
        final int PORRIDGE_INTERVAL = 45; // minutes
        final int MILK_INTERVAL = 30;     // minutes
        
        double porridgeAvailable = 2.0; // 2 liters
        double milkAvailable = 2.0;     // 2 liters
        
        int totalTime = 0; // in minutes
        int feedingCount = 0;
        
        System.out.println("\n--- FEEDING SCHEDULE ---");
        
        // Using while loop as shown in "while Loop Flow Chart"
        while (porridgeAvailable > 0 || milkAvailable > 0) {
            feedingCount++;
            System.out.printf("%nFeeding #%d at %d minutes:%n", feedingCount, totalTime);
            
            // Determine what to feed based on availability
            if (porridgeAvailable >= CUP_CAPACITY && milkAvailable >= CUP_CAPACITY) {
                // Alternate between porridge and milk
                if (feedingCount % 2 == 1) {
                    // Odd feedings: porridge
                    System.out.println("  Feeding: Half cup of Aunt Porridge (0.5L)");
                    porridgeAvailable -= CUP_CAPACITY;
                    totalTime += PORRIDGE_INTERVAL;
                    System.out.printf("  Next feeding in: %d minutes%n", PORRIDGE_INTERVAL);
                } else {
                    // Even feedings: milk  
                    System.out.println("  Feeding: Full cup of Lato Milk (0.5L)");
                    milkAvailable -= CUP_CAPACITY;
                    totalTime += MILK_INTERVAL;
                    System.out.printf("  Next feeding in: %d minutes%n", MILK_INTERVAL);
                }
            } else if (porridgeAvailable >= CUP_CAPACITY) {
                // Only porridge left
                System.out.println("  Feeding: Half cup of Aunt Porridge (0.5L)");
                porridgeAvailable -= CUP_CAPACITY;
                totalTime += PORRIDGE_INTERVAL;
                System.out.printf("  Next feeding in: %d minutes%n", PORRIDGE_INTERVAL);
            } else if (milkAvailable >= CUP_CAPACITY) {
                // Only milk left
                System.out.println("  Feeding: Full cup of Lato Milk (0.5L)");
                milkAvailable -= CUP_CAPACITY;
                totalTime += MILK_INTERVAL;
                System.out.printf("  Next feeding in: %d minutes%n", MILK_INTERVAL);
            } else {
                // Not enough for a full feeding
                break;
            }
            
            System.out.printf("  Remaining - Porridge: %.1fL, Milk: %.1fL%n", 
                            porridgeAvailable, milkAvailable);
        }
        
        // Calculate total time in hours and minutes
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        
        System.out.println("\n=== FINAL RESULTS ===");
        System.out.printf("Total feeding sessions: %d%n", feedingCount);
        System.out.printf("Total time to finish all food: %d hours %d minutes%n", hours, minutes);
        System.out.printf("Remaining porridge: %.1fL%n", porridgeAvailable);
        System.out.printf("Remaining milk: %.1fL%n", milkAvailable);
        
        input.close();
    }
}