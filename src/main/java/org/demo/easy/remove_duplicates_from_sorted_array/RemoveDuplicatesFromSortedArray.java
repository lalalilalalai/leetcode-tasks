package org.demo.easy.remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("Task https://leetcode.com/problems/remove-duplicates-from-sorted-array/");
        int[] nums = new int[]{1, 2, 4, 4, 4, 5, 90, 91, 91};
        System.out.println("Result for array " + Arrays.toString(nums) + " : " + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        return (int) Arrays.stream(nums)
                .distinct()
                .count();
    }
}