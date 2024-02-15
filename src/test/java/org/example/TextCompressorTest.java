package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextCompressorTest {

    @Test
    void compress1() {
        Assertions.assertEquals(
                "a3b2cd3",
                new TextCompressor().compress("aaabbcddd")
        );
    }

    @Test
    void compressOnlyALetter() {
        Assertions.assertEquals(
                "a",
                new TextCompressor().compress("a")
        );
    }

    @Test
    void compressSpecialCharacters() {
        Assertions.assertEquals(
                "a3b2cd3[[b3",
                new TextCompressor().compress("aaabbcddd[[bbb")
        );
    }

    @Test
    void compressBlank() {
        Assertions.assertEquals(
                "",
                new TextCompressor().compress("")
        );
    }

    @Test
    void compressNull() {
        Assertions.assertEquals(
                "",
                new TextCompressor().compress(null)
        );
    }
}