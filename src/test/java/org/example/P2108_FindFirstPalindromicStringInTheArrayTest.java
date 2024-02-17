package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P2108_FindFirstPalindromicStringInTheArrayTest {

    @Test
    void firstPalindromeExample1() {
        Assertions.assertEquals(
                "ada",
                new P2108_FindFirstPalindromicStringInTheArray()
                        .firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"})
        );
    }

    @Test
    void firstPalindromeExample2() {
        Assertions.assertEquals(
                "",
                new P2108_FindFirstPalindromicStringInTheArray()
                        .firstPalindrome(new String[]{"def", "ghi"})
        );
    }

    @Test
    void firstPalindromeExample3() {
        Assertions.assertEquals(
                "racecar",
                new P2108_FindFirstPalindromicStringInTheArray()
                        .firstPalindrome(new String[]{"notapalindrome", "racecar"})
        );
    }
}