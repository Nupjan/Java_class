import java.util.Scanner;

public class Stringformatting {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = stdin.next();
        System.out.println("How many banana's would you like to purchase? >");
        int number = stdin.nextInt();
        int PRICE_PER_BANANA = 2;
        System.out.printf("Hello %s! You have purchased %d amount of bananas, therefore your price checks out to %d",
                name, number, (PRICE_PER_BANANA * number));
        stdin.close();
    }
}
