package com.dsa.arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int current = nums[0];
        int count = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] == current) count++;
            else count--;
            
            if(count == 0){
                current = nums[i];
                count = 1;
            }  
        }

        return current;
    }
	
	public static void main(String[] args) {
		int[] nums = {5,5,1,1,1,5,5};
		System.out.println(majorityElement(nums));
	}

}
