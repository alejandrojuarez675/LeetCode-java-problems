package org.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class P35_SearchInsertPositionTest {

    @Test
    fun searchInsertExample1() {
        assertEquals(
            2,
            P35_SearchInsertPosition().searchInsert(intArrayOf(1,3,5,6), 5)
        )
    }

    @Test
    fun searchInsertExample2() {
        assertEquals(
            1,
            P35_SearchInsertPosition().searchInsert(intArrayOf(1,3,5,6), 2)
        )
    }

    @Test
    fun searchInsertExample3() {
        assertEquals(
            4,
            P35_SearchInsertPosition().searchInsert(intArrayOf(1,3,5,6), 7)
        )
    }
}