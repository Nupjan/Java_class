
package Miniprojects;

import java.util.Scanner;

public class Average {
    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int sum;
        double avg;
        System.out.println("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter the value of c: ");
        c = scanner.nextInt();
        sum = a + b + c;
        avg = (double) sum / 3;
        System.out.println("The average of your given numbers are: " + avg);
        scanner.close();

    } // end class
}