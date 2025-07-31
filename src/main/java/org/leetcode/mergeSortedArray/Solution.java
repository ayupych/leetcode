package org.leetcode.mergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rPointerFromNums1 = m - 1; //Индекс последнего числа первого массива
        int rPointerFromNums2 = n - 1; //Индекс последнего числа второго массива
        int pointerToEnd = nums1.length - 1; //Последний индекс нужного первого массива

        while (rPointerFromNums2 >= 0) //Проходимся по второму массиву пока есть данные
        {
            if (rPointerFromNums1 >= 0 && nums1[rPointerFromNums1] >= nums2[rPointerFromNums2]) {//Если последний элемент в первом массиве >= последнего элемента второго массива
                nums1[pointerToEnd] = nums1[rPointerFromNums1];//То в последнюю ячейку записываем последний элемент чисел из первого массива
                rPointerFromNums1--;
                pointerToEnd--;
            } else {
                nums1[pointerToEnd] = nums2[rPointerFromNums2];//Инача последнюю ячейку записываем последний элемент чисел из первого массива
                rPointerFromNums2--;
                pointerToEnd--;
            }
        }
    }
}

