package com.dsa.arrays;

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        int i = 0;
        int mid = 0;
        int j = nums.length - 1;

        while (mid <= j) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[i];
                nums[i] = temp;
                i++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        sorter.sortColors(nums);
        System.out.println("After sorting:  " + Arrays.toString(nums));
    }
}

