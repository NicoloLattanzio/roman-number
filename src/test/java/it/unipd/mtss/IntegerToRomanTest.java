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
    void convertShouldReturnIIWhenNumberIs2() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    void convertShouldReturnIIIWhenNumberIs3() {
        assertEquals("III", IntegerToRoman.convert(3));
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
    void convertShouldThrowExceptionWhenNumberIsAbove3() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(4));
    }
}
