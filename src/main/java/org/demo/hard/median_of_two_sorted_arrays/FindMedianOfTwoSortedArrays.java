package org.demo.hard.median_of_two_sorted_arrays;

public class FindMedianOfTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println("Task https://leetcode.com/problems/median-of-two-sorted-arrays/description/");

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println("Median of two sorted arrays: " + findMedianSortedArrays(nums1, nums2));

        nums1 = new int[]{1, 6};
        nums2 = new int[]{5, 7, 8, 9};
        System.out.println("Median of two sorted arrays: " + findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        if (mergedArray.length % 2 == 0) {
            return (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2.0;
        } else {
            return mergedArray[mergedArray.length / 2];
        }
    }
}
