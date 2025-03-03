package testquestions;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        // Importing java function
        Scanner scan = new Scanner(System.in);
        double perimeter;
        // User prompting
        System.out.println("Enter the Length for a rectangle: ");
        double length = scan.nextDouble();
        System.out.println("ENter the Width for the rectangle: ");
        double width = scan.nextDouble();

        // Calculations
        perimeter = 2 * (length + width);

        // Output
        System.out.println("The perimeter of your Rectangle is: " + perimeter);
        scan.close();
    }
}
