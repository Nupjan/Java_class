package testquestions;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tax = 0;
        // User prompt
        System.out.print("Enter your annual income: $");
        double income = scanner.nextDouble();

        // Display

        if (income <= 18200) {
            // No tax for income up to $18,200
            tax = 0;
        } else if (income <= 45000) {
            // 16c for each $1 over $18,200
            tax = (income - 18200) * 0.16;
        } else if (income <= 135000) {
            // $4,288 plus 30c for each $1 over $45,000
            tax = 4288 + (income - 45000) * 0.30;
        } else if (income <= 190000) {
            // $31,288 plus 37c for each $1 over $135,000
            tax = 31288 + (income - 135000) * 0.37;
        } else {
            // $51,638 plus 45c for each $1 over $190,000
            tax = 51638 + (income - 190000) * 0.45;
        }
        System.out.printf("The tax you have to pay is: $%.2f%n", tax);

        // Close the scanner
        scanner.close();
    }

}