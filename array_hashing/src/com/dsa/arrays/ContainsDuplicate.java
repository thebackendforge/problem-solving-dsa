package com.dsa.arrays;

import java.util.HashSet;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int nums[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num: nums) {
			if(set.contains(num)) return true;
			else set.add(num);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,3};
		System.out.println(containsDuplicate(nums));
		
		int nums1[] = {1,2,3,4};
		System.out.println(containsDuplicate(nums1));
	}

}
