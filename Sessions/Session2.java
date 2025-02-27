
public class Session2 {
    public static void main(String[] args) {
        int keys = 88;
        System.out.println("A piano has " + keys + " keys.");
        int answer;
        answer = 2 + 2;

        System.out.println("2 + 2 is " + answer);
        // data type showcase
        System.out.println("Primitive variable assignment");
        double x = 5.12;
        double y = 19.28;
        double rememberX = x;
        x = y;
        y = rememberX;
        System.out.println("therefore the values we get are: ");
        System.out.println("x: " + x + ", y: " + y + ", rememberX: " + rememberX);
        // VAlue switiching example

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt); // Outputs 9

        // Narrowing Casting example, Widening casting is done automatically
    }
}