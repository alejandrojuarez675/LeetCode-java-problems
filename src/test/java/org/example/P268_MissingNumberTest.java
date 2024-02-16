package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P268_MissingNumberTest {

    @Test
    void missingNumberExample1() {
        Assertions.assertEquals(
                2,
                new P268_MissingNumber().missingNumber(new int[]{3,0,1})
        );
    }

    @Test
    void missingNumberExample2() {
        Assertions.assertEquals(
                2,
                new P268_MissingNumber().missingNumber(new int[]{0,1})
        );
    }

    @Test
    void missingNumberExample3() {
        Assertions.assertEquals(
                8,
                new P268_MissingNumber().missingNumber(new int[]{9,6,4,2,3,5,7,0,1})
        );
    }
}