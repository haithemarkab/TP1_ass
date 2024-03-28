package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    private Anagram anag;
    @BeforeEach
    void SetUp() {
        anag= new Anagram();
    }



    @Test
    void testFirstIsNULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "ESS"));
    }
    @Test
    public void testNotTheSameLength() {
        assertFalse(anag.isAnagram("haithem", "math"));
    }
    @Test
    public void testIsAnagram() {
        assertEquals(true, anag.isAnagram("mohamed", "mohamed"));
    }

    @Test
    void testBothNULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }


    @Test
    public void testNotAnagram() {
        assertFalse(anag.isAnagram("azertyui", "azerttttttt"));
    }
    @Test
    void testSecondIsNULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("haithem", null));
    }



}