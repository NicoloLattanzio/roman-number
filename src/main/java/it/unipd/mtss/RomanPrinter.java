/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        if (num <= 0 || num > 3) {
            return "";
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] lines = new String[6]; // Ogni asciiart è composta da 6 righe
        for (int i = 0; i < lines.length; i++) {
            lines[i] = "";
        }
    
        // Per ogni carattere romano, aggiungi le sue righe allineate orizzontalmente
        for (char ch : romanNumber.toCharArray()) {
            String[] artLines = AsciiArt.valueOf(String.valueOf(ch)).getArt().split("\n");
            for (int i = 0; i < artLines.length; i++) {
                if (!lines[i].isEmpty()) {
                    lines[i] += " "; // Spazio tra simboli
                }
                lines[i] += artLines[i];
            }
        }
    
        return String.join("\n", lines) + "\n";
    }

    private enum AsciiArt {
        I(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n");  // Rappresentazione asciiart di "I"

        private final String art;

        AsciiArt(String art) {
            this.art = art;
        }

        public String getArt() {
            return art;
        }
    }
}