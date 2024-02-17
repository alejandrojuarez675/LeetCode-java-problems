package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P860_LemonadeChangeTest {

    @Test
    void lemonadeChangeExample1() {
        Assertions.assertEquals(
                true,
                new P860_LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 10, 20})
        );
    }

    @Test
    void lemonadeChangeExample2() {
        Assertions.assertEquals(
                false,
                new P860_LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20})
        );
    }
}