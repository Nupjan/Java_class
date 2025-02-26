public class ReservedWordsTable {
    public static void main(String[] args) {
        // Array of Java reserved words
        String[] reservedWords = {
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "const", "continue",
                "default", "do", "double", "else", "enum",
                "extends", "false", "final", "finally", "float",
                "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected",
                "return", "short", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient",
                "true", "try", "volatile", "while"
        };

        // Print table header
        System.out.println("+-------------------+");
        System.out.println("| Java Reserved Words |");
        System.out.println("+-------------------+");

        // Print reserved words in a table format
        for (int i = 0; i < reservedWords.length; i++) {
            System.out.printf("| %-17s |%n", reservedWords[i]);
            if ((i + 1) % 5 == 0 || i == reservedWords.length - 1) {
                System.out.println("+-------------------+");
            }
        }
    }
}