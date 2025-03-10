package testquestions;

public class StringTest {
    public static void main(String[] args) {

        String ans = "Time is gold";
        System.out.println(ans.length());
        System.out.println(ans.equalsIgnoreCase("TIME IS GOLD"));
        System.out.println(ans.equals("TIME IS GOLD"));
        System.out.println(ans.charAt(1));
        System.out.println(ans.replace('i', '*'));
        System.out.println(ans.charAt(1));
        System.out.println(ans.substring(1, 7));
        String ans1 = ans.toUpperCase();
        String ans2 = ans + " " + ans1;
        System.out.println(ans2.replace('i', '#'));
        System.out.println(ans1);
        System.out.println(ans2);
    }
}