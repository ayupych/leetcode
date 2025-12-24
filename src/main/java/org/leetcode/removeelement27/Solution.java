package org.leetcode.removeelement27;

public class Solution {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        int target = 3;
        System.out.println(removeElement(array, target));

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

