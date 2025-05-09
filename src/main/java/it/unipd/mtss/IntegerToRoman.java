/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Numero fuori dal range [1,1000]");
        }

        String[] migliaia = {"", "M"};
        String[] centinaia = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decine = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return migliaia[number / 1000] +
               centinaia[(number % 1000) / 100] +
               decine[(number % 100) / 10] +
               unita[number % 10];
    }
}