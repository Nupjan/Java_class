public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Print the header
        System.out.println(
                "+-------------------+---------------------+---------------+---------------------------------------+");
        System.out.println(
                "| TYPE NAME         | KIND OF VALUE       | MEMORY USED   | SIZE RANGE                            |");
        System.out.println(
                "+-------------------+---------------------+---------------+---------------------------------------+");

        // Print each row of the table
        printRow("boolean", "true or false", "1 byte", "not applicable");
        printRow("char", "single character (Unicode)", "2 bytes", "all Unicode characters");
        printRow("byte", "integer", "1 byte", "–128 to 127");
        printRow("short", "integer", "2 bytes", "–32768 to 32767");
        printRow("int", "integer", "4 bytes", "–2147483648 to 2147483647");
        printRow("long", "integer", "8 bytes", "–9223372036854775808 to 9223372036854775807");
        printRow("float", "floating-point number", "4 bytes", "–3.40282347 × 10^38 to –1.40239846 × 10^45");
        printRow("double", "floating-point number", "8 bytes", "±1.76769313 × 10^308 to ±4.9406564 × 10^324");

        // Print the footer
        System.out.println(
                "+-------------------+---------------------+---------------+---------------------------------------+");
    }

    // Helper method to print a row in the table
    private static void printRow(String type, String kind, String memory, String range) {
        System.out.printf("| %-17s | %-19s | %-13s | %-37s |%n", type, kind, memory, range);
    }
}