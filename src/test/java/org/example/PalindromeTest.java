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
    public void test_est_notpalindrome() {

        assertEquals(false, palindrome.isPalindrome("haithem"));
    }
    @Test
    void Palindrome_Original_ilfaut_Throw_Null_Exception() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindromeOriginal(null));
    }


}