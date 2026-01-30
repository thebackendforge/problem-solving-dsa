package com.dsa.arrays;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum2(int[] nums, int target) {
		int n = nums.length;
		HashMap<Integer, Integer> mapp = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			int rem = target - nums[i];
			
			if(mapp.containsKey(rem)) {
				return new int[] {mapp.get(rem), i};
			}
			else {
				mapp.put(nums[i], i);
			}
			
		}
		
		return new int[] {-1,-1};
	}
	
	public static int[] twoSum1(int[] nums, int target) {
		int n = nums.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(nums[i] + nums[j] == target) return new int[] {i,j};
			}
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int[] nums = {3,4,5,7};
		int target = 7;
		int ans[] = twoSum1(nums, target);
		for(int element: ans) System.out.print(element + " ");
		int ans1[] = twoSum2(nums, target);
		for(int element: ans1) System.out.print(element + " ");
	}

}
