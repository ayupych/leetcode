package org.palindromeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.palindromenumber.Solution;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        int x = 10;
        int y = 161;
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isPalindrome(x));
        Assertions.assertTrue(solution.isPalindrome(y));
    }
}