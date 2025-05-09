/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        if (num <= 0 || num > 10) {
            return "";
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder[] lines = new StringBuilder[6];// Ogni asciiart è composta da 6 righe
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new StringBuilder();
        }
        // Per ogni carattere romano, aggiungi le sue righe allineate orizzontalmente
        for (char ch : romanNumber.toCharArray()) { 
            String[] artLines = AsciiArt.valueOf(String.valueOf(ch)).getArt().split("\n");
            for (int i = 0; i < artLines.length; i++) {
                if (i < lines.length) {
                    lines[i].append(artLines[i]); 
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder line : lines) {
            result.append(line.toString()).append("\n");
        }
        return result.toString();
    }
    // Rappresentazione asciiart di I, V e X
    private enum AsciiArt {
        I(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|"),
        V("__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    "),
        X("__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\");

        private final String art;

        AsciiArt(String art) {
            this.art = art;
        }

        public String getArt() {
            return art;
        }
    }
}