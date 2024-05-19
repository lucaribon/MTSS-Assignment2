////////////////////////////////////////////////////////////////////
// Luca Ribon 2075516
// Matteo Bazzan 2076422
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

        @Test
        public void printCharacterI() {
            String characterI = "  _____ \n"+
                    " |_   _|\n"+
                    "   | |  \n"+
                    "   | |  \n"+
                    "  _| |_ \n"+
                    " |_____|\n";

            assertEquals(characterI, RomanPrinter.print(1));
        }

        @Test
        public void printCharacterV() {
            String characterV = " __      __\n"+
                    " \\ \\    / /\n"+
                    "  \\ \\  / / \n"+
                    "   \\ \\/ /  \n"+
                    "    \\  /   \n"+
                    "     \\/    \n";

            assertEquals(characterV, RomanPrinter.print(5));
        }

        @Test
        public void printCharacterX() {
            String characterX =" __   __\n"+
                    " \\ \\ / /\n"+
                    "  \\ V / \n"+
                    "   > <  \n"+
                    "  / . \\ \n"+
                    " /_/ \\_\\\n";

            assertEquals(characterX, RomanPrinter.print(10));
        }

        @Test
        public void printCharacterL() {
            String characterL = "  _      \n"+
                    " | |     \n"+
                    " | |     \n"+
                    " | |     \n"+
                    " | |____ \n"+
                    " |______|\n";

            assertEquals(characterL, RomanPrinter.print(50));
        }

        @Test
        public void printCharacterC() {
            String characterC ="   _____ \n"+
                    "  / ____|\n"+
                    " | |     \n"+
                    " | |     \n"+
                    " | |____ \n"+
                    "  \\_____|\n";

            assertEquals(characterC, RomanPrinter.print(100));
        }

        @Test
        public void printCharacterD() {
            String characterD = "  _____  \n"+
                    " |  __ \\ \n"+
                    " | |  | |\n"+
                    " | |  | |\n"+
                    " | |__| |\n"+
                    " |_____/ \n";

            assertEquals(characterD, RomanPrinter.print(500));
        }

        @Test
        public void printCharacterM() {
            String characterM ="  __  __\n"+
                    " |  \\/  |\n"+
                    " | \\  / |\n"+
                    " | |\\/| |\n"+
                    " | |  | |\n"+
                    " |_|  |_|\n";

            assertEquals(characterM, RomanPrinter.print(1000));
        }

        @Test
        public void printAllInlineCharacter() {
            String characters = "  __  __  _____     _____   _       __   __ __      __  _____ \n" +
                    " |  \\/  | |  __ \\   / ____| | |      \\ \\ / / \\ \\    / / |_   _|\n" +
                    " | \\  / | | |  | | | |      | |       \\ V /   \\ \\  / /    | |  \n" +
                    " | |\\/| | | |  | | | |      | |        > <     \\ \\/ /     | |  \n" +
                    " | |  | | | |__| | | |____  | |____   / . \\     \\  /     _| |_ \n" +
                    " |_|  |_| |_____/   \\_____| |______| /_/ \\_\\     \\/     |_____|\n";
            assertEquals(characters, RomanPrinter.print(1666));
        }

        @Test
        public void printNoCharacter() {
            assertEquals("", RomanPrinter.print(0));
        }
}