import java.util.Scanner;

public class BodyMassIndexCalc {
    public static void main(String[] args) {
        // define constants
        final double CM_PER_M = 0.01;
        // displaying introduction
        System.out.println("Welcome to BMIcalculator.");

        // introducing input
        Scanner stdin = new Scanner(System.in);

        // User information
        System.out.println("Enter your weight in kgs: ");
        double kg = stdin.nextDouble();

        System.out.println("Enter your height in cm: ");
        double cm = stdin.nextDouble();

        // Calculations
        double metreheight = cm * CM_PER_M;
        double bmi = kg / (metreheight * metreheight);

        // display result
        System.out.println("Your BMI is: " + bmi);
        stdin.close();

    }

}
