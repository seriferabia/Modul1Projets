package prWeek7.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome = new Palindrome();

    @Test
    void testPalindromeOdd() {
        Assertions.assertTrue(palindrome.isPalindrome("nurses run"));
    }

    @Test
    void testPalindromeEven() {
        Assertions.assertTrue(palindrome.isPalindrome("redder"));
    }

    @Test
    void testPalindromeEmpty() {
        Assertions.assertTrue(palindrome.isPalindrome(""));
    }


}