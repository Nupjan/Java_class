package testquestions;

public class TestIf {
    public static void main(String args[]) {
        char c;
        int x = 16;

        // Ternary operator to assign 'E' or 'O' to c
        c = (x % 2 == 0) ? 'E' : 'O';

        System.out.println(c);
    }
}