package org.demo.remove_element;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("Task https://leetcode.com/problems/remove-element/description/");
        int[] nums = new int[]{1, 2, 4, 4, 4, 5, 90, 91, 91};
        int val = 4;
        System.out.println("Result for array " + Arrays.toString(nums) +
                " and a value " + val + " : " +
                removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int[] sortedNums = Arrays.stream(nums)
                .filter(value -> value != val)
                .toArray();
        for (int i = 0; i < sortedNums.length; i++) {
            nums[i] = sortedNums[i];
        }
        return sortedNums.length;
    }
}