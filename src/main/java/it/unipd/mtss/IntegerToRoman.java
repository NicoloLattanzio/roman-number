/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 100) {
            throw new IllegalArgumentException("Numero fuori dal range [1,100]");
        }

        String[] centinaia = {"", "C"};
        String[] decine = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return centinaia[number / 100] + 
               decine[(number % 100) / 10] + 
               unita[number % 10];
    }
}