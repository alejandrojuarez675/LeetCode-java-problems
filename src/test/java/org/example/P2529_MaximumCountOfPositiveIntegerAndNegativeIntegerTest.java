package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2529_MaximumCountOfPositiveIntegerAndNegativeIntegerTest {

    @Test
    void maximumCountExample1() {
        Assertions.assertEquals(
                3,
                new P2529_MaximumCountOfPositiveIntegerAndNegativeInteger().maximumCount(new int[]{-2, -1, -1, 1, 2, 3})
        );
    }

    @Test
    void maximumCountExample2() {
        Assertions.assertEquals(
                3,
                new P2529_MaximumCountOfPositiveIntegerAndNegativeInteger().maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2})
        );
    }

    @Test
    void maximumCountExample3() {
        Assertions.assertEquals(
                4,
                new P2529_MaximumCountOfPositiveIntegerAndNegativeInteger().maximumCount(new int[]{5, 20, 66, 1314})
        );
    }

    @Test
    void maximumCountOnlyZeros() {
        Assertions.assertEquals(
                0,
                new P2529_MaximumCountOfPositiveIntegerAndNegativeInteger().maximumCount(new int[]{0, 0, 0})
        );
    }

}