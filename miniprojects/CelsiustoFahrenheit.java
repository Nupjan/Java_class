package Miniprojects;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {

        int celsius = 28;
        int fahrenheit = 32 + (9 * celsius) / 5;
        System.out.print("Celcius: ");
        System.out.println(celsius);

        System.out.print("equals Fahrenheit temperature: " + fahrenheit);
    }
}