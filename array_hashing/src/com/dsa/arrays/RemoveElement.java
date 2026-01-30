package com.dsa.arrays;

public class RemoveElement {

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
	
	public static void main(String[] args) {
		int[] nums = {1,1,2,3,4};
		int val = 1;
		
		int k = removeElement(nums, val);
		System.out.println(k);

	}

}
