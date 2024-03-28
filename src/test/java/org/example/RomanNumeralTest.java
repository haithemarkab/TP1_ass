package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class RomanNumeralTest {


    @Test
    void testRomanNumeralGrand_off_3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void testRomanNumeralless_off_0() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-19));
    }
    @Test
    void testRomanNum8() {
        String expected = "VIII";
        String returned = RomanNumeral.toRoman(8);
        assertEquals(expected, returned);
    }
    @Test
    void testRomanNum9() {
        String expected = "IX";
        String returned = RomanNumeral.toRoman(9);
        assertEquals(expected, returned);
    }
    @Test
    void testRomanNumer10() {
        String expected = "X";
        String returned = RomanNumeral.toRoman(10);
        assertEquals(expected, returned);
    }







}