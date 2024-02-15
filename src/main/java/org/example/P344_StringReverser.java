package org.example;

public class P344_StringReverser {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) return;

        char[] response = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            response[i] = s[s.length - 1 - i];
        }

        System.arraycopy(response, 0, s, 0, response.length);
    }
}