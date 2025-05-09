/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 10) {
            throw new IllegalArgumentException("Numero fuori dal range [1,10]");
        }

        String[] romanNumerals = {
            "", "I", "II", "III", "IV", "V", 
            "VI", "VII", "VIII", "IX", "X"
        };
        return romanNumerals[number];
    }
}