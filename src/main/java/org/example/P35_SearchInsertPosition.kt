package org.example

class P35_SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var initIndex = 0
        var endIndex = nums.size
        var middleIndex = 0
        while (initIndex < endIndex) {
            middleIndex = initIndex + (endIndex - initIndex) / 2
            val middleValue = nums[middleIndex]
            if (middleValue == target) {
                return middleIndex
            } else if (middleValue > target){
                endIndex = middleIndex - 1
            } else {
                initIndex = middleIndex + 1
            }
        }
        return middleIndex + 1
    }
}