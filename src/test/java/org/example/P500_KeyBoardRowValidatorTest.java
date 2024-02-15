package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P500_KeyBoardRowValidatorTest {

    @Test
    void findWordsEx1() {
        Assertions.assertArrayEquals(
                new String[]{"Alaska","Dad"},
                new P500_KeyBoardRowValidator().findWords(new String[]{"Hello","Alaska","Dad","Peace"})
        );
    }

    @Test
    void findWordsEx2() {
        Assertions.assertArrayEquals(
                new String[]{"adsdf","sfd"},
                new P500_KeyBoardRowValidator().findWords(new String[]{"adsdf","sfd"})
        );
    }

    @Test
    void findWordsEx3() {
        Assertions.assertArrayEquals(
                new String[]{"Alaska","Dad"},
                new P500_KeyBoardRowValidator().findWords(new String[]{"Hello","Alaska","Dad","Peace"})
        );
    }
}