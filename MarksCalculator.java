package java_methods;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the lecturer to enter marks for three units
        System.out.print("Enter marks for Java Programming: ");
        int javaMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Networking: ");
        int networkingMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int mathsMarks = scanner.nextInt();

        // Calculate the average marks
        double average = (javaMarks + networkingMarks + mathsMarks) / 3.0;

        // Display the results
        System.out.println("Marks for Java Programming: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}
