////////////////////////////////////////////////////////////////////
// Luca Ribon 2075516
// Matteo Bazzan 2076422
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void convertBelowZero() {
        assertEquals("", IntegerToRoman.convert(-1));
    }

    @Test
    public void convertZero() {
        assertEquals("", IntegerToRoman.convert(0));
    }

    @Test
    public void convertTooBig() {
        assertEquals("", IntegerToRoman.convert(4000));
    }

    @Test
    public void convertUpToThree() {
        for (int i = 1; i <= 3; i++) {
            assertEquals("I".repeat(i), IntegerToRoman.convert(i));
        }
    }

    @Test
    public void convertUpToTen() {
        Map<String, Integer> expectedMap = Map.of(
                "IV", 4,
                "V", 5,
                "VI", 6,
                "VII", 7,
                "VIII", 8,
                "IX", 9,
                "X", 10
        );
        for (Map.Entry<String, Integer> entry : expectedMap.entrySet()) {
            assertEquals(entry.getKey(), IntegerToRoman.convert(entry.getValue()));
        }

    }

    @Test
    public void convertUptoTwenty() {
        Map<String, Integer> expectedMap = Map.of(
                "XI", 11,
                "XII", 12,
                "XIII", 13,
                "XIV", 14,
                "XV", 15,
                "XVI", 16,
                "XVII", 17,
                "XVIII", 18,
                "XIX", 19,
                "XX", 20
        );
        for (Map.Entry<String, Integer> entry : expectedMap.entrySet()) {
            assertEquals(entry.getKey(), IntegerToRoman.convert(entry.getValue()));
        }
    }

    @Test
    public void convertUpToFifty(){
        Map<String,Integer> expectedMap = Map.of(
                "XXI", 21,
                "XXIX", 29,
                "XXX", 30,
                "XXXV", 35,
                "XXXIX", 39,
                "XL", 40,
                "XLIV", 44,
                "XLIX", 49,
                "L", 50
        );

        for (Map.Entry<String, Integer> entry : expectedMap.entrySet()) {
            assertEquals(entry.getKey(), IntegerToRoman.convert(entry.getValue()));
        }
    }

    @Test
    public void convertUpToHundred(){
        Map<String,Integer> expectedMap = Map.of(
                "LI", 51,
                "LX", 60,
                "LXV", 65,
                "LXX", 70,
                "LXXVII", 77,
                "LXXX", 80,
                "XC", 90,
                "XCIV", 94,
                "XCIX", 99,
                "C", 100
        );

        for (Map.Entry<String, Integer> entry : expectedMap.entrySet()) {
            assertEquals(entry.getKey(), IntegerToRoman.convert(entry.getValue()));
        }
    }

    @Test
    public void convertUpToFiveHundred(){
        Map<String, Integer> expectedMap = Map.of(
                "CI", 101,
                "CXXX", 130,
                "CLXX", 170,
                "CCXL", 240,
                "CCXC", 290,
                "CCC", 300,
                "CCCXC", 390,
                "CD", 400,
                "CDXC", 490,
                "D", 500
        );

        for (Map.Entry<String, Integer> entry : expectedMap.entrySet()) {
            assertEquals(entry.getKey(), IntegerToRoman.convert(entry.getValue()));
        }
    }

    @Test
    public void convertUpToThousand(){
        Map<String, Integer> expectedMap = Map.of(
                "DI", 501,
                "DC", 600,
                "DCXXX", 630,
                "DCLX", 660,
                "DCC", 700,
                "DCCC", 800,
                "DCCCXC", 890,
                "CM", 900,
                "CMLXXVII", 977,
                "M", 1000
        );

        for (Map.Entry<String, Integer> entry : expectedMap.entrySet()) {
            assertEquals(entry.getKey(), IntegerToRoman.convert(entry.getValue()));
        }
    }
}