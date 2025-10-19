/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vu.concavemirrorverification;
import java.util.Scanner;

public class ConcaveMirrorVerification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== WAKISHA MOCK EXAM - CONCAVE MIRROR VERIFICATION ===");
        System.out.println("Using Mirror Formula: 1/f = 1/v + 1/u");
        System.out.println("Note: u is always negative for concave mirrors");
        
        // i) Accept object distance u and image distance v
        System.out.print("\nEnter object distance u (in cm): ");
        double u = input.nextDouble();
        
        // Assign u as negative for concave mirror (as per problem requirement)
        u = -Math.abs(u); // Using Math.abs to ensure negative value
        
        System.out.print("Enter image distance v (in cm, positive for real images): ");
        double v = input.nextDouble();
        
        // Input validation using if statements from "One-way if Statements"
        if (v <= 0) {
            System.out.println("Error: Image distance must be positive for real images!");
            return;
        }
        
        // ii) Calculate focal length using mirror formula
        // Formula: f = 1 / ((1/v) + (1/u))
        double focalLength = 1 / ((1/v) + (1/u));
        
        // iii) Display results and check acceptability
        System.out.printf("%nCalculation Results:%n");
        System.out.printf("Object distance (u) = %.2f cm%n", u);
        System.out.printf("Image distance (v) = %.2f cm%n", v);
        System.out.printf("Focal length (f) = %.2f cm%n", focalLength);
        
        // Using if-else-if statements from "Multiple Alternative if Statements"
        if (focalLength >= 9.0 && focalLength <= 11.0) {
            System.out.println("✅ ACCEPTABLE: Focal length lies between 21.0cm and 25.0cm");
            System.out.println("The concave mirror meets WAKISHA MOCK EXAM standards!");
        } else {
            System.out.println("❌ NOT ACCEPTABLE: Focal length is outside required range");
            System.out.println("The concave mirror does NOT meet WAKISHA MOCK EXAM standards.");
            
            // Additional diagnostic information
            if (focalLength < 9.0) {
                System.out.println("Reason: Focal length is too short (f < 9.0 cm)");
            } else {
                System.out.println("Reason: Focal length is too long (f > 11.0 cm)");
            }
        }
        
        input.close();
    }
}
