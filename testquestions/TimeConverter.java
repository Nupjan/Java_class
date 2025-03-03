package testquestions;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // Declaring Constants
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_MINUTE = 60;
        // importing system input
        Scanner scan = new Scanner(System.in);
        // Declaring variables
        int minutes, seconds;

        // User Prompts
        System.out.println(
                "Hi! This is a time converter that converts a certain hour to its minute and seconds equivalent.");
        System.out.println("Enter the number of hours that you want to convert: ");
        int hours = scan.nextInt();

        // Calculation
        minutes = hours * MINUTES_PER_HOUR;
        seconds = hours * MINUTES_PER_HOUR * SECONDS_PER_MINUTE;

        // output
        System.out.println("The minute equivalent to " + hours + " is: " + minutes);
        System.out.println("The second equivalent to " + hours + " is: " + seconds);

        scan.close();
    }
}
