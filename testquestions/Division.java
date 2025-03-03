package testquestions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        // declaring variables
        double num1, num2;
        // User prompts
        System.out.println("Please enter a decimal number: ");
        num1 = scan.nextDouble();
        System.out.println("Please enter another decimal number: ");
        num2 = scan.nextDouble();

        // Calculations in printf
        System.out.printf("the first number %.2f divided by the second number %.2f is %.2f", num1, num2, (num1 / num2));

        scan.close();
    }
}
