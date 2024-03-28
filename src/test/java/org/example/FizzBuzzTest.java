package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class FizzBuzzTest {
    private FizzBuzz fizzBuzzTest;
    @BeforeEach
    void SetUp() {
        fizzBuzzTest = new FizzBuzz();
    }
    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzTest.fizzBuzz(-19));
    }
    @Test
    public void testMultiple_3() {
        assertEquals("Fizz", fizzBuzzTest.fizzBuzz(6));
    }
    @Test
    public void testMultiple3andMultiple_5() {
        assertEquals("FizzBuzz", fizzBuzzTest.fizzBuzz(30));
    }
    @Test
    public void testNotAnyMultiple3_5() {
        assertEquals("13", fizzBuzzTest.fizzBuzz(13));
    }

    @Test
    public void testMultiple_5() {
        assertEquals("Buzz", fizzBuzzTest.fizzBuzz(25));
    }




}