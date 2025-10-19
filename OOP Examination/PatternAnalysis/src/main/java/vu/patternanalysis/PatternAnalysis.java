/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.patternanalysis;


public class PatternAnalysis {
    public static void main(String[] args) {
        System.out.println("Code Analysis:");
        System.out.println("for (int row = 1; row <= 3; row++)");
        System.out.println("{");
        System.out.println("    for (int count = 1; count <= (4 - row); count++)");
        System.out.println("    {");
        System.out.println("        System.out.print(\"*\");");
        System.out.println("    }");
        System.out.println("    System.out.println();");
        System.out.println("}");
        
        System.out.println("\nTrace Execution:");
        
        // Tracing the execution as shown in "Trace for Loop" examples
        for (int row = 1; row <= 3; row++) {
            System.out.printf("%nRow %d: (4 - %d) = %d -> ", row, row, (4 - row));
            System.out.print("Prints ");
            for (int count = 1; count <= (4 - row); count++) {
                System.out.print("*");
            }
            System.out.println(" stars");
        }
        
        System.out.println("\nFinal Output:");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}

