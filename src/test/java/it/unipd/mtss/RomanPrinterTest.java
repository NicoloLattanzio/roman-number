/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {
    @Test
    public void testPrintI() {
        String expected = 
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|\n";
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    public void testPrintII() {
        String expected = 
            " _____   _____ \n" +
            "|_   _| |_   _|\n" +
            "  | |     | |  \n" +
            "  | |     | |  \n" +
            " _| |_   _| |_ \n" +
            "|_____| |_____|\n";
        assertEquals(expected, RomanPrinter.print(2));
    }

    @Test
    public void testPrintIII() {
        String expected = 
            " _____   _____   _____ \n" +
            "|_   _| |_   _| |_   _|\n" +
            "  | |     | |     | |  \n" +
            "  | |     | |     | |  \n" +
            " _| |_   _| |_   _| |_ \n" +
            "|_____| |_____| |_____|\n";
        assertEquals(expected, RomanPrinter.print(3));
    }

    @Test
    public void testPrintEmptyForZero() {
        assertEquals("", RomanPrinter.print(0));
    }

    @Test
    public void testPrintEmptyForNegative() {
        assertEquals("", RomanPrinter.print(-1));
    }

    @Test
    public void testPrintEmptyForAbove3() {
        assertEquals("", RomanPrinter.print(4));
    }
}
