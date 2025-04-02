public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = { -5, 10, -2, 8, 3, -7, 4, };
        double average = 0.0;
        int sum = 0;
        int count = 0;

        for (int num : numbers) { // Missing Code #1: Iterate through the array
            if (num > 0) { // Missing Code #2: Check if the number is positive
                sum += num; // Missing Code #3: Add the positive number to sum
                count++; // Missing Code #4: Increment the count of positive numbers
            }
        }

        // After iteration, if count is greater than 0, calculate the average
        // Otherwise, average remains 0.0
        if (count > 0) { // Missing Code #5: Check if there are positive numbers
            average = (double) sum / count; // Missing Code #6: Calculate the average
        }

        System.out.println("Average of positive numbers: " + average);
    }
}
