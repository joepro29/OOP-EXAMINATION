/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.elitesacco;

import java.util.Scanner;

public class EliteSACCO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double INTEREST_RATE = 0.05; // 5% interest rate
        
        System.out.println("=== ELITE SACCO INVESTMENT CALCULATOR ===");
        
        // (i) Using For Loop as demonstrated in "for Loops" section
        System.out.println("\n--- Using FOR Loop ---");
        System.out.print("Enter number of teachers: ");
        int numTeachersFor = input.nextInt();
        
        // For loop syntax from notes: for(initial-action; condition; action-after-each-iteration)
        for (int i = 1; i <= numTeachersFor; i++) {
            System.out.print("Enter principal amount for teacher " + i + ": UGX ");
            double principal = input.nextDouble();
            System.out.print("Enter investment period (years) for teacher " + i + ": ");
            int years = input.nextInt();
            
            // Compound interest formula: A = P(1 + r)^t
            double futureValue = principal * Math.pow(1 + INTEREST_RATE, years);
            System.out.printf("Teacher %d: Investment value after %d years = UGX %.2f%n", 
                            i, years, futureValue);
        }
        
        // (ii) Using While Loop as shown in "while Loop Flow Chart"
        System.out.println("\n--- Using WHILE Loop ---");
        System.out.print("Enter number of teachers: ");
        int numTeachersWhile = input.nextInt();
        
        int count = 1; // Initialization before while loop
        // While loop syntax: while(loop-continuation-condition)
        while (count <= numTeachersWhile) {
            System.out.print("Enter principal amount for teacher " + count + ": UGX ");
            double principal = input.nextDouble();
            System.out.print("Enter investment period (years) for teacher " + count + ": ");
            int years = input.nextInt();
            
            double futureValue = principal * Math.pow(1 + INTEREST_RATE, years);
            System.out.printf("Teacher %d: Investment value after %d years = UGX %.2f%n", 
                            count, years, futureValue);
            
            count++; // Increment counter - crucial to avoid infinite loop
        }
        
        input.close();
    }
}
