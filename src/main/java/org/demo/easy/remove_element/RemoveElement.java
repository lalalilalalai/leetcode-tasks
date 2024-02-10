package org.demo.easy.remove_element;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println("Task https://leetcode.com/problems/remove-element/description/");
        int[] nums1 = new int[]{1, 2, 4, 4, 4, 5, 90, 91, 91};
        int[] nums2 = new int[]{1, 2, 4, 4, 4, 5, 90, 91, 91};
        int val = 4;

        System.out.println("Result for array " + Arrays.toString(nums1) +
                " and a value " + val + " : " +
                removeElement(nums1, val));

        System.out.println("Result for array " + Arrays.toString(nums2) +
                " and a value " + val + " : " +
                removeAllOccurrencesOfElement(nums2, val));
    }

    /**
     * Removes all occurrences of a specified value from an array and modifies the original array.
     *
     * @param nums the input array of integers
     * @param val  the value to be removed from the array
     * @return the new length of the array after removing the specified value
     */
    public static int removeElement(int[] nums, int val) {
        int[] sortedNums = Arrays.stream(nums)
                .filter(value -> value != val)
                .toArray();
        System.arraycopy(sortedNums, 0, nums, 0, sortedNums.length);
        return sortedNums.length;
    }

    /**
     * Removes all occurrences of a specified value from an array and modifies the original array.
     *
     * @param nums the input array of integers
     * @param val  the value to be removed from the array
     * @return the new length of the array after removing the specified value
     */
    public static int removeAllOccurrencesOfElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}