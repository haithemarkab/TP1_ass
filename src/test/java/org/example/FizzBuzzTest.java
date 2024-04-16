package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class FizzBuzzTest {
    private FizzBuzz fizzBuzzTest;
    @BeforeEach
    void Fizz() {
        fizzBuzzTest = new FizzBuzz();
    }
    @Test
    public void test_negative() {

        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTest.fizzBuzz(-19));
    }
    @Test
    public void test_multiple_3() {

        assertEquals("Fizz", fizzBuzzTest.fizzBuzz(6));
    }
    @Test
    public void test_multiple_3_et_multiple_5() {

        assertEquals("FizzBuzz", fizzBuzzTest.fizzBuzz(30));
    }
    @Test
    public void test_not_any_multiple_3et5() {

        assertEquals("13", fizzBuzzTest.fizzBuzz(13));
    }

    @Test
    public void test_multiple_5() {

        assertEquals("Buzz", fizzBuzzTest.fizzBuzz(25));
    }




}