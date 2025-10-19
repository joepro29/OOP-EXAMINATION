/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.mockgradingsystemextended;

import java.util.Scanner;

public class MockGradingSystemExtended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] gradeCounts = new int[10]; // Index 0-9, but we use 1-9
        int studentCount = 1;
        
        while (studentCount <= 5) {
            System.out.print("Enter score for student " + studentCount + " (0-100): ");
            int score = input.nextInt();
            
            String grade;
            String remark;
            
            if (score >= 80 && score <= 100) {
                grade = "1";
                remark = "Distinction";
            } else if (score >= 75 && score <= 79) {
                grade = "2";
                remark = "Distinction";
            } else if (score >= 66 && score <= 74) {
                grade = "3";
                remark = "Credit";
            } else if (score >= 60 && score <= 65) {
                grade = "4";
                remark = "Credit";
            } else if (score >= 50 && score <= 59) {
                grade = "5";
                remark = "Credit";
            } else if (score >= 45 && score <= 49) {
                grade = "6";
                remark = "Credit";
            } else if (score >= 35 && score <= 44) {
                grade = "7";
                remark = "Pass";
            } else if (score >= 30 && score <= 34) {
                grade = "8";
                remark = "Pass";
            } else if (score >= 0 && score <= 29) {
                grade = "9";
                remark = "Fail";
            } else {
                grade = "Invalid";
                remark = "Invalid score entered";
            }
            
            System.out.println("Student " + studentCount + " - Score: " + score + ", Grade: " + grade + ", Remark: " + remark);
            
            // Update grade counts if the grade is valid (1-9)
            if (!grade.equals("Invalid")) {
                int gradeIndex = Integer.parseInt(grade);
                gradeCounts[gradeIndex]++;
            }
            
            studentCount++;
        }
        
        // Display summary
        System.out.println("\n=== SUMMARY OF GRADES ===");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + ": " + gradeCounts[i] + " student(s)");
        }
        
        input.close();
    }
}
