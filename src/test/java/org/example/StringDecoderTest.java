package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDecoderTest {

    @Test
    void decodeString1() {
        Assertions.assertEquals(
                "aaabcbc",
                new StringDecoder().decodeString("3[a]2[bc]")
        );
    }

    @Test
    void decodeString2() {
        Assertions.assertEquals(
                "accaccacc",
                new StringDecoder().decodeString("3[a2[c]]")
        );
    }

    @Test
    void decodeString3() {
        Assertions.assertEquals(
                "abcabccdcdcdef",
                new StringDecoder().decodeString("2[abc]3[cd]ef")
        );
    }

    @Test
    void decodeString4() {
        Assertions.assertEquals(
                "abcabc",
                new StringDecoder().decodeString("2[abc]")
        );
    }
}