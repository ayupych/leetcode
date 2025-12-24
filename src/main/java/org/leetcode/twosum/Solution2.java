package org.leetcode.twosum;

import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (mapa.containsKey(x)) {
                return new int[]{mapa.get(x), i};
            }
            mapa.put(nums[i], i);
        }
        return new int[]{};
    }
}
