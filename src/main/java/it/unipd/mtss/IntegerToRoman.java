/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 3) {
            throw new IllegalArgumentException("Numero fuori dal range [1,3]");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            result.append("I");
        }
        return result.toString();
    }
}