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
    void testFirst_est_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "ESS"));
    }
    @Test
    void testSecond_est_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("haithem", null));
    }
    @Test
    public void testNot_meme_Length() {
        assertFalse(anag.isAnagram("haithem", "math"));
    }
    @Test
    public void test_est_Anagram() {
        assertEquals(true, anag.isAnagram("mohamed", "mohamed"));
    }

    @Test
    void test_les_deux_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }


    @Test
    public void test_No_Anagram() {
        assertFalse(anag.isAnagram("azertyui", "azerttttttt"));
    }




}