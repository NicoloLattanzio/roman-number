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

    @Test // Per Papa Leone XIV
    void convertShouldReturnXIVWhenNumberIs14() {
    assertEquals("XIV", IntegerToRoman.convert(14));
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
    void convertShouldReturnLWhenNumberIs50() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    void convertShouldReturnCWhenNumberIs100() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    void convertShouldReturnXLWhenNumberIs40() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    void convertShouldReturnXCWhenNumberIs90() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    void convertShouldReturnLXWhenNumberIs60() {
        assertEquals("LX", IntegerToRoman.convert(60));
    }
    @Test
    void convertShouldReturnDWhenNumberIs500() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    void convertShouldReturnMWhenNumberIs1000() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    void convertShouldReturnCDWhenNumberIs400() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    void convertShouldReturnCMWhenNumberIs900() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    void convertShouldReturnCXLWhenNumberIs140() {
        assertEquals("CXL", IntegerToRoman.convert(140));
    }

    @Test
    void convertShouldReturnCXLWhenNumberIs967() {
        assertEquals("CMLXVII", IntegerToRoman.convert(967));
    }

    @Test
    void convertShouldThrowExceptionWhenNumberIsAbove1000() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
    }
    @Test
    void convertShouldThrowExceptionWhenNumberIsZero() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
    }

    @Test
    void convertShouldThrowExceptionWhenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }
    
}