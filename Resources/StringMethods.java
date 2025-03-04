public class StringMethods {
    public static void main(String[] args) {
        // Create some strings to work with
        String str1 = "Hello, World!";
        String str2 = "hello, world!";
        String str3 = "Java is fun!";

        // 1. charAt(int index)
        System.out.println("1. charAt(7): " + str1.charAt(7)); // Output: W

        // 2. compareTo(String str)
        System.out.println("2. compareTo: " + str1.compareTo(str2)); // Output: -32 (lexical difference)

        // 3. concat(String str)
        String concatenated = str1.concat(" ").concat(str3);
        System.out.println("3. concat: " + concatenated); // Output: Hello, World! Java is fun!

        // 4. equals(String str)
        System.out.println("4. equals: " + str1.equals(str2)); // Output: false

        // 5. equalsIgnoreCase(String str)
        System.out.println("5. equalsIgnoreCase: " + str1.equalsIgnoreCase(str2)); // Output: true

        // 6. length()
        System.out.println("6. length: " + str1.length()); // Output: 13

        // 7. replace(char oldChar, char newChar)
        String replaced = str1.replace('o', '0');
        System.out.println("7. replace: " + replaced); // Output: Hell0, W0rld!

        // 8. substring(int offset, int endIndex)
        String substring = str1.substring(7, 12);
        System.out.println("8. substring: " + substring); // Output: World

        // 9. toLowerCase()
        String lowerCase = str1.toLowerCase();
        System.out.println("9. toLowerCase: " + lowerCase); // Output: hello, world!

        // 10. toUpperCase()
        String upperCase = str1.toUpperCase();
        System.out.println("10. toUpperCase: " + upperCase); // Output: HELLO, WORLD!
    }
}