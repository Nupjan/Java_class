import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = stdin.next();
        System.out.println("Enter another string.");
        String s2 = stdin.next();
        if (s1.equals(s2))
            System.out.println("They're the same message");
        else
            System.out.println("They contain different values.");
        stdin.close();
    }
}