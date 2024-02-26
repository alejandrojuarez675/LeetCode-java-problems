package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramValidatorTest {

    @Test
    void validateNoSameLength() {
        assertFalse(new AnagramValidator().validate("anagram", "test"));
    }

    @Test
    void validateExample1() {
        assertTrue(new AnagramValidator().validate("silent", "listen"));
    }

    @Test
    void validateExample2() {
        assertFalse(new AnagramValidator().validate("silentt", "listenn"));
    }
}