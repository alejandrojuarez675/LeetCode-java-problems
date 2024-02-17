package org.example;

/**
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
 * A string is palindromic if it reads the same forward and backward.
 * <p>
 * Example 1:
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 * <p>
 * Example 2:
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 * <p>
 * Example 3:
 * Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is returned.
 * <p>
 * Constraints:
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists only of lowercase English letters.
 */
public class P2108_FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (i > word.length() / 2) break;
            char left = word.charAt(i);
            char right = word.charAt(word.length() - 1 - i);
            if (left != right) return false;
        }
        return true;
    }
}
