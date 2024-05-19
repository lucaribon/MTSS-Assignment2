////////////////////////////////////////////////////////////////////
// Luca Ribon 2075516
// Matteo Bazzan 2076422
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {

        if (romanNumber.isEmpty()){
            return "";
        }

        return asciiComposer(romanNumber).toString();
    }

    private static StringBuilder asciiComposer(String romanNumber) {
        String[] M = {"  __  __",
                " |  \\/  |",
                " | \\  / |",
                " | |\\/| |",
                " | |  | |",
                " |_|  |_|"};
        String[] D = {"  _____  ",
                " |  __ \\ ",
                " | |  | |",
                " | |  | |",
                " | |__| |",
                " |_____/ "};
        String[] C = {"   _____ ",
                "  / ____|",
                " | |     ",
                " | |     ",
                " | |____ ",
                "  \\_____|"};
        String[] L = {"  _      ",
                " | |     ",
                " | |     ",
                " | |     ",
                " | |____ ",
                " |______|"};
        String[] X = {" __   __",
                " \\ \\ / /",
                "  \\ V / ",
                "   > <  ",
                "  / . \\ ",
                " /_/ \\_\\"};
        String[] V = {" __      __",
                " \\ \\    / /",
                "  \\ \\  / / ",
                "   \\ \\/ /  ",
                "    \\  /   ",
                "     \\/    "};
        String[] I = {"  _____ ",
                " |_   _|",
                "   | |  ",
                "   | |  ",
                "  _| |_ ",
                " |_____|"};

        StringBuilder asciiArt = new StringBuilder();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                switch (romanNumber.charAt(j)) {
                    case 'M':
                        asciiArt.append(M[i]);
                        break;
                    case 'D':
                        asciiArt.append(D[i]);
                        break;
                    case 'C':
                        asciiArt.append(C[i]);
                        break;
                    case 'L':
                        asciiArt.append(L[i]);
                        break;
                    case 'X':
                        asciiArt.append(X[i]);
                        break;
                    case 'V':
                        asciiArt.append(V[i]);
                        break;
                    case 'I':
                        asciiArt.append(I[i]);
                        break;
                }
            }
            asciiArt.append("\n");
        }

        return asciiArt;
    }
}