package org.leetcode.palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
