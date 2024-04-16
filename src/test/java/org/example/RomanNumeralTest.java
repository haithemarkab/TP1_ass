package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class RomanNumeralTest {


    @Test
    void test_RomanNumer_grand_off_3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    void test_RomanNumer_moins_off_0() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-19));
    }
    @Test
    void test_RomanNum_8() {
        String expected = "VIII";
        String returned = RomanNumeral.toRoman(8);
        assertEquals(expected, returned);
    }
    @Test
    void test_RomanNum_9() {
        String expected = "IX";
        String returned = RomanNumeral.toRoman(9);
        assertEquals(expected, returned);
    }
    @Test
    void test_RomanNumer_10() {
        String expected = "X";
        String returned = RomanNumeral.toRoman(10);
        assertEquals(expected, returned);
    }







}