/////////////////////////////////////////////////
// Nicolo Lattanzio 2101056
// Andrea Sgreva 2113179
/////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToRomanTest {
    @Test
    void convertShouldReturnIWhenNumberIs1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    void convertShouldReturnVWhenNumberIs5() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    void convertShouldReturnXWhenNumberIs10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    void convertShouldReturnIVWhenNumberIs4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    void convertShouldReturnIXWhenNumberIs9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    void convertShouldThrowExceptionWhenNumberIsZero() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
    }

    @Test
    void convertShouldThrowExceptionWhenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }

    @Test
    void convertShouldThrowExceptionWhenNumberIsAbove10() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(11));
    }
}