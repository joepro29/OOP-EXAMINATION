/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vu.mockgradingsystem;
import java.util.Scanner;

public class MockGradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student's score (0-100): ");
        int score = input.nextInt();
        
        String grade;
        String remark;
        
        // Using if-else-if ladder as per the grading table
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
        
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);
        
        input.close();
    }
}