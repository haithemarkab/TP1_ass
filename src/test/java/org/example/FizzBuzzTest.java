package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzzTest;





    @BeforeEach
    void SetUp() {
        fizzBuzzTest = new FizzBuzz();
    }
    @Test
    public void testMultiple3() {
        assertEquals("Fizz", fizzBuzzTest.fizzBuzz(15));
    }





    @Test
    public void testMultiple3andMultiple5() {
        assertEquals("FizzBuzz", fizzBuzzTest.fizzBuzz(30));
    }
    @Test
    public void testNotAnyMultiple() {
        assertEquals("13", fizzBuzzTest.fizzBuzz(13));
    }

    @Test
    public void testMultiple5() {
        assertEquals("Buzz", fizzBuzzTest.fizzBuzz(25));
    }


    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTest.fizzBuzz(-2));
    }

}