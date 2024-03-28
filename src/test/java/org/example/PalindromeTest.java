package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private Palindrome palindrome;
    @BeforeEach
    void palind() {
        palindrome = new Palindrome();
    }
    @Test
    public void test_est_Palindrome() {
        assertEquals(true, palindrome.isPalindrome("radar"));
    }

    @Test
    public void test_est_Palindrom2() {
        assertEquals(true, palindrome.isPalindrome("elle"));
    }

    @Test
    public void testIsnotpalindrome() {

        assertEquals(false, palindrome.isPalindrome("haithem"));
    }
    @Test
    void isPalindromeOriginal_ilfaut_ThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindromeOriginal(null));
    }


}