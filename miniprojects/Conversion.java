// Purpose: Convert $30 AU to US dollars
package Miniprojects;

public class Conversion {
    // main method
    public static void main(String[] args) {
        // set conversion constant
        final double AUS_TO_US = 0.92;

        // set Australian dollar amount
        int ausDollar = 30;

        // convert to US dollars
        double usDollar = AUS_TO_US * ausDollar;

        // display result
        System.out.print("$" + ausDollar);
        System.out.print(" AU = $US " + usDollar);
    } // end main
} // end class