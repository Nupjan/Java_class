import java.util.Scanner;

public class Voting_age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Can you provide me your age: >");
        age = scan.nextInt();
        if (age < 18)
            System.out.println("You are not eligible to vote.");
        else
            System.out.println("You are eligible to vote!");

        scan.close();
    }
}
