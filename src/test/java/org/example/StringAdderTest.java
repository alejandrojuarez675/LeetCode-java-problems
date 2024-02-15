package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAdderTest {

    @Test
    void addStringsExample1() {
        Assertions.assertEquals(
                "134",
                new StringAdder().addStrings("11", "123")
        );
    }

    @Test
    void addStringsExample2() {
        Assertions.assertEquals(
                "533",
                new StringAdder().addStrings("456", "77")
        );
    }

    @Test
    void addStringsExample3() {
        Assertions.assertEquals(
                "0",
                new StringAdder().addStrings("0", "0")
        );
    }

    @Test
    void addStringsExampleSameLength() {
        Assertions.assertEquals(
                "25",
                new StringAdder().addStrings("10", "15")
        );
    }

    @Test
    void addStringsExampleExtraCharacterAtInit() {
        Assertions.assertEquals(
                "105",
                new StringAdder().addStrings("10", "95")
        );
    }
}