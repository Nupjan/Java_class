package testquestions;

import java.util.Scanner;

//Write a java program that will ask the user for the height and radius of a cylinder and then print out the volume of the cylinder . You may use the value 3.14 as the constant in your program.
public class Cylinder {
    public static void main(String[] args) {
        // Declaring constants and variables

        double PIE = 3.14;
        double volume;
        // Scanner util
        Scanner scan = new Scanner(System.in);
        // User prompts
        System.out.println("Enter the height of your cylinder: ");
        double h = scan.nextDouble();
        System.out.println("Enter the radius of your cylinder: ");
        double r = scan.nextDouble();
        // Calculations
        volume = 2.0 * PIE * (r * r) * h;
        // Output
        System.out.println("The volume of your cylinder is " + volume);

        scan.close();

    }
}
