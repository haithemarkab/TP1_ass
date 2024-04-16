package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    private Anagram anag;
    @BeforeEach
    void ang() {
        anag= new Anagram();
    }



    @Test
    void test_first_est_NULL() {

        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "ESS"));
    }
    @Test
    void test_second_est_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("haithem", null));
    }
    @Test
    public void test_not_meme_Length() {
        assertFalse(anag.isAnagram("haithem", "math"));
    }
    @Test
    public void test_est_anagram() {
        assertEquals(true, anag.isAnagram("mohamed", "mohamed"));
    }

    @Test
    void test_les_deux_NULL() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }


/*
    @Test
    void test_les_deux_NULL() {l, null));
    }
    */


    @Test
    public void test_No_Anagram() {
        assertFalse(anag.isAnagram("azertyui", "azerttttttt"));
    }




}