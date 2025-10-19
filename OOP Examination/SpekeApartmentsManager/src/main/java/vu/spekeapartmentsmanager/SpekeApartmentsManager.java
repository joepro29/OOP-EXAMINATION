/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.spekeapartmentsmanager;

import java.util.Scanner;

class AccommodationArea {
    private String areaName;
    private int occupants;
    private boolean[] lights; // lights 1, 2, 3
    
    public AccommodationArea(String name) {
        this.areaName = name;
        this.occupants = 0;
        this.lights = new boolean[3]; // default all false (OFF)
    }
    
    // Getters and setters
    public String getAreaName() { return areaName; }
    public int getOccupants() { return occupants; }
    public boolean[] getLights() { return lights; }
    
    public void addOccupants(int n) {
        if (n > 0) {
            occupants += n;
            System.out.println(n + " occupants added to " + areaName);
        }
    }
    
    public void removeOccupants(int n) {
        if (n > 0) {
            occupants = Math.max(0, occupants - n);
            System.out.println(n + " occupants removed from " + areaName);
        }
    }
    
    public void switchLight(int lightNum, boolean turnOn) {
        if (lightNum >= 1 && lightNum <= 3) {
            lights[lightNum - 1] = turnOn;
            String status = turnOn ? "ON" : "OFF";
            System.out.println("Light " + lightNum + " in " + areaName + " switched " + status);
        }
    }
    
    public void reportStatus() {
        System.out.println("\n=== " + areaName + " Status Report ===");
        System.out.println("Occupants: " + occupants);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
        }
        System.out.println("============================\n");
    }
}

public class SpekeApartmentsManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create accommodation areas
        AccommodationArea gymArea = new AccommodationArea("Gym Area");
        AccommodationArea swimmingArea = new AccommodationArea("Swimming Area");
        
        AccommodationArea activeArea = null;
        char choice;
        
        do {
            // Display main menu
            System.out.println("\n=== SPEKE APARTMENTS ACCOMMODATION MANAGER ===");
            System.out.println("S - Select Active Area");
            System.out.println("W - Add Occupants");
            System.out.println("X - Remove Occupants");
            System.out.println("Y - Switch Light ON");
            System.out.println("Z - Switch Light OFF");
            System.out.println("R - Report Status");
            System.out.println("Q - Quit Program");
            System.out.print("Enter your choice: ");
            
            choice = input.next().toUpperCase().charAt(0);
            
            switch (choice) {
                case 'S': // Select active area
                    System.out.print("Select area (G for Gym, P for Swimming): ");
                    char areaChoice = input.next().toUpperCase().charAt(0);
                    if (areaChoice == 'G') {
                        activeArea = gymArea;
                        System.out.println("Gym Area is now active");
                    } else if (areaChoice == 'P') {
                        activeArea = swimmingArea;
                        System.out.println("Swimming Area is now active");
                    } else {
                        System.out.println("Invalid area selection! Use G or P only.");
                    }
                    break;
                    
                case 'W': // Add occupants
                    if (checkActiveArea(activeArea)) {
                        System.out.print("Enter number of occupants to add: ");
                        if (input.hasNextInt()) {
                            int n = input.nextInt();
                            activeArea.addOccupants(n);
                        } else {
                            System.out.println("Invalid input! Please enter an integer.");
                            input.next(); // Clear invalid input
                        }
                    }
                    break;
                    
                case 'X': // Remove occupants
                    if (checkActiveArea(activeArea)) {
                        System.out.print("Enter number of occupants to remove: ");
                        if (input.hasNextInt()) {
                            int n = input.nextInt();
                            activeArea.removeOccupants(n);
                        } else {
                            System.out.println("Invalid input! Please enter an integer.");
                            input.next(); // Clear invalid input
                        }
                    }
                    break;
                    
                case 'Y': // Switch light ON
                    if (checkActiveArea(activeArea)) {
                        System.out.print("Enter light number (1-3) to switch ON: ");
                        if (input.hasNextInt()) {
                            int lightNum = input.nextInt();
                            if (lightNum >= 1 && lightNum <= 3) {
                                activeArea.switchLight(lightNum, true);
                            } else {
                                System.out.println("Invalid light number! Use 1, 2, or 3 only.");
                            }
                        } else {
                            System.out.println("Invalid input! Please enter an integer.");
                            input.next(); // Clear invalid input
                        }
                    }
                    break;
                    
                case 'Z': // Switch light OFF
                    if (checkActiveArea(activeArea)) {
                        System.out.print("Enter light number (1-3) to switch OFF: ");
                        if (input.hasNextInt()) {
                            int lightNum = input.nextInt();
                            if (lightNum >= 1 && lightNum <= 3) {
                                activeArea.switchLight(lightNum, false);
                            } else {
                                System.out.println("Invalid light number! Use 1, 2, or 3 only.");
                            }
                        } else {
                            System.out.println("Invalid input! Please enter an integer.");
                            input.next(); // Clear invalid input
                        }
                    }
                    break;
                    
                case 'R': // Report status
                    if (checkActiveArea(activeArea)) {
                        activeArea.reportStatus();
                    }
                    break;
                    
                case 'Q': // Quit program
                    System.out.println("Thank you for using Speke Apartments Manager!");
                    System.out.println("Program terminated successfully.");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select from the menu options.");
            }
            
        } while (choice != 'Q');
        
        input.close();
    }
    
    // Helper method to check if active area is selected
    private static boolean checkActiveArea(AccommodationArea area) {
        if (area == null) {
            System.out.println("Error: No active area selected! Please use 'S' to select an area first.");
            return false;
        }
        return true;
    }
}


