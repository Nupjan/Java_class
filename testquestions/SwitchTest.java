package testquestions;

public class SwitchTest {

    public static void main(String[] args) {
        for (int a = 0; a < 5; a++) {
            switch (a) {
                case 0:
                    System.out.println("a value is 0");
                    break;
                case 1:
                    System.out.println("a value is 1");
                    break;
                case 2:
                    System.out.println("a value is 2");
                    break;
                default:
                    System.out.println("a value is greater than 2 and less than 5");
            }
        }
    }

}
