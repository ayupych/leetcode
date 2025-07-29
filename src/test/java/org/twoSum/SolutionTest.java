package org.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.twoSum.Solution;

public class SolutionTest {
    @Test
    public void testTwoSumFound() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = Solution.twoSum(nums, target);
        Assertions.assertEquals(2, ints.length);
        Assertions.assertArrayEquals(new int[]{0, 1}, ints);
    }
}
