package org.example;

/**
 Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 You must also not convert the inputs to integers directly.

 Example 1:
 Input: num1 = "11", num2 = "123"
 Output: "134"

 Example 2:
 Input: num1 = "456", num2 = "77"
 Output: "533"

 Example 3:
 Input: num1 = "0", num2 = "0"
 Output: "0"

 Constraints:
 1 <= num1.length, num2.length <= 104
 num1 and num2 consist of only digits.
 num1 and num2 don't have any leading zeros except for the zero itself.
 */
public class P415_StringAdder {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int maxLength = Math.max(num1.length(), num2.length());
        int accumulator = 0;
        for (int i = 0; i < maxLength; i++) {
            int a = getNumberAtIndexFromFinal(num1, i);
            int b = getNumberAtIndexFromFinal(num2, i);
            int res = a + b + accumulator;
            accumulator = res > 9 ? 1 : 0;
            result.append(res % 10);
        }
        if (accumulator == 1) result.append(1);

        return result.reverse().toString();
    }

    private int getNumberAtIndexFromFinal(String num1, int index) {
        if (index > num1.length() - 1) return 0;
        return Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1 - index)));
    }
}