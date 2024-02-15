package org.example;

class P704_BinarySearcher {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int initIndex = 0;
        int endIndex = nums.length - 1;

        while (initIndex < endIndex) {
            int middleIndex = initIndex + (endIndex - initIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] < target) {
                initIndex = middleIndex;
            } else {
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
