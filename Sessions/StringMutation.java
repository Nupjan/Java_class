public class StringMutation {
    public static void main(String[] args) {
        String phrase = "Change is inevitable";
        System.out.println("Length of string: " + phrase.length());
        String phrase1 = phrase.toUpperCase();
        String phrase2 = phrase.toLowerCase();
        String phrase3 = phrase.substring(3, 9);

        // Print each mutated string
        System.out.println("phrase1: " + phrase1);
        System.out.println("phrase2: " + phrase2);
        System.out.println("phrase3: " + phrase3);
        System.out.println("phrase3 length: " + phrase3.length());

    }
}