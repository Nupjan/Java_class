public class ScannerMethodsDisplay {
    public static void main(String[] args) {
        // Print the header
        System.out.println("+-------------------+----------------------------------------------------+");
        System.out.println("| Return Type       | Method Description                                   |");
        System.out.println("+-------------------+----------------------------------------------------+");

        // Print each row of the table
        printRow("boolean", "nextBoolean()",
                "Scans the next token of the input into a boolean value and returns that value.");
        printRow("long", "nextLong()", "Scans the next token of the input as a long.");
        printRow("long", "nextLong(int radix)", "Scans the next token of the input as a long.");
        printRow("byte", "nextByte()", "Scans the next token of the input as a byte.");
        printRow("byte", "nextByte(int radix)", "Scans the next token of the input as a byte.");
        printRow("double", "nextDouble()", "Scans the next token of the input as a double.");
        printRow("float", "nextFloat()", "Scans the next token of the input as a float.");
        printRow("int", "nextInt()", "Scans the next token of the input as an int.");
        printRow("int", "nextInt(int radix)", "Scans the next token of the input as an int.");
        printRow("String", "nextLine()", "Scans the next line of the input as a String.");
        printRow("short", "nextShort()", "Scans the next token of the input as a short.");
        printRow("short", "nextShort(int radix)", "Scans the next token of the input as a short.");

        // Print the footer
        System.out.println("+-------------------+----------------------------------------------------+");
        System.out.println("\nThe online documentation for the Java Platform can be found at:");
        System.out.println("http://docs.oracle.com/javase/8/docs/api/index.html");
    }

    // Helper method to print a row in the table
    private static void printRow(String returnType, String method, String description) {
        System.out.printf("| %-17s | %-50s |%n", returnType + " " + method, description);
    }
}