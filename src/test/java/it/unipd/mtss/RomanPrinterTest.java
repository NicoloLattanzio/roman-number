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
    public void testPrintV() {
        String expected = 
            "__      __\n" +
            "\\ \\    / /\n" +
            " \\ \\  / / \n" +
            "  \\ \\/ /  \n" +
            "   \\  /   \n" +
            "    \\/    \n";
        assertEquals(expected, RomanPrinter.print(5));
    }

    @Test
    public void testPrintX() {
        String expected = 
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  > <  \n" +
            " / . \\ \n" +
            "/_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    public void testPrintIV() {
        String expected = 
            " _____ __      __\n" +
            "|_   _|\\ \\    / /\n" +
            "  | |   \\ \\  / / \n" +
            "  | |    \\ \\/ /  \n" +
            " _| |_    \\  /   \n" +
            "|_____|    \\/    \n";
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    public void testPrintIX() {
        String expected = 
            " _____ __   __\n" +
            "|_   _|\\ \\ / /\n" +
            "  | |   \\ V / \n" +
            "  | |    > <  \n" +
            " _| |_  / . \\ \n" +
            "|_____|/_/ \\_\\\n";
        assertEquals(expected, RomanPrinter.print(9));
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
    public void testPrintEmptyForAbove10() {
        assertEquals("", RomanPrinter.print(11));
    }
}