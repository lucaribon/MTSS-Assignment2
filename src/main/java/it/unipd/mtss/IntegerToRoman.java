////////////////////////////////////////////////////////////////////
// Luca Ribon 2075516
// Matteo Bazzan 2076422
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        // if number is below 1 or above 3999, return an empty string
        if(number < 1 || number>3999) {
            return "";
        }

        StringBuilder romanNumber = new StringBuilder();

        String[] romanChars = {
                "M",
                "CM",
                "D",
                "CD",
                "C",
                "XC",
                "L",
                "XL",
                "X",
                "IX",
                "V",
                "IV",
                "I"
        };
        int[] romanValues = {
                1000,
                900,
                500,
                400,
                100,
                90,
                50,
                40,
                10,
                9,
                5,
                4,
                1
        };

        for (int i = 0; i < romanChars.length; i++) {
            while (number >= romanValues[i]) {
                romanNumber.append(romanChars[i]);
                number -= romanValues[i];
            }
        }
        return romanNumber.toString();
    }
}