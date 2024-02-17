package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P1642_FurthestBuildingYouCanReachTest {

    @Test
    void furthestBuildingExample1() {
        Assertions.assertEquals(
                4,
                new P1642_FurthestBuildingYouCanReach().furthestBuilding(
                        new int[]{4,2,7,6,9,14,12},
                        5,
                        1
                )
        );
    }

    @Test
    void furthestBuildingExample2() {
        Assertions.assertEquals(
                7,
                new P1642_FurthestBuildingYouCanReach().furthestBuilding(
                        new int[]{4,12,2,7,3,18,20,3,19},
                        10,
                        2
                )
        );
    }

    @Test
    void furthestBuildingExample3() {
        Assertions.assertEquals(
                3,
                new P1642_FurthestBuildingYouCanReach().furthestBuilding(
                        new int[]{14,3,19,3},
                        17,
                        0
                )
        );
    }

    @Test
    void furthestBuildingExample4() {
        Assertions.assertEquals(
                1,
                new P1642_FurthestBuildingYouCanReach().furthestBuilding(
                        new int[]{7,5,13},
                        0,
                        0
                )
        );
    }
}