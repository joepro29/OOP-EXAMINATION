/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.loan;

import java.util.Scanner;
// Abstract class as shown in "Abstract Classes and Abstract Methods"
public abstract class Loan {
    // Data members with private access - encapsulation
    private String loan_id;
    private String loan_type;
    private double amount;
    private String customer_name;
    
    // Default no-arg constructor - initializes amount to 0
    public Loan() {
        this.amount = 0.0;
        System.out.println("Loan no-arg constructor called");
    }
    
    // Parameterized constructor
    public Loan(String loan_id, String customer_name) {
        this();
        this.loan_id = loan_id;
        this.customer_name = customer_name;
    }
    
    // Set methods - mutators
    public void setLoanId(String loan_id) {
        this.loan_id = loan_id;
    }
    
    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }
    
    // Get methods - accessors
    public String getLoanId() {
        return loan_id;
    }
    
    public String getCustomerName() {
        return customer_name;
    }
    
    public String getLoanType() {
        return loan_type;
    }
    
    // Method to set loan amount with validation
    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Error: Loan amount cannot be negative!");
        }
    }
    
    // Method to return loan amount
    public double getAmount() {
        return amount;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract void setLoanType(String type);
    
    // Concrete method in abstract class
    public void displayLoanInfo() {
        System.out.println("Loan ID: " + loan_id);
        System.out.println("Customer: " + customer_name);
        System.out.println("Amount: UGX " + amount);
        if (loan_type != null) {
            System.out.println("Type: " + loan_type);
        }
    }
}