package testquestions;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declaring constant
        final int CURRENT_YEAR = 2025;
        int age;

        // User Prompt
        System.out.println("Input the year you were born in: ");
        int year = scan.nextInt();

        // CAlculations
        age = CURRENT_YEAR - year;

        // output
        System.out.println("You are going to be " + age + " by the end of this year!");
        scan.close();

    }
}
