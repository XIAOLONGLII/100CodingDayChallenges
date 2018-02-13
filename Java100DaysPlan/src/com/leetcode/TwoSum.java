package com.leetcode;

import java.util.*;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */


public class TwoSum {

	/*public static int[] twoSum(int[] nums, int target)
	{
		//1. put each element in hashMap
		Map<Integer, Integer> map = new HashMap();
		for(int i = 0; i < nums.length;i++)
		{
			map.put( nums[i],i);
		}
		
		//2. A +B = target, check B if inside of array, meantime map.get(B) != i; target = 4, 2 + 2;
		for(int i = 0; i < nums.length;i++)
		{
			int a = nums[i];
			int b = target - a;
			if( map.containsKey(b) && map.get(b) != i)
			{
				return new int[]{i,map.get(b)}; 
			}
		}
		 throw new IllegalArgumentException("No two sum solution");
	}
	
	*/
	
	public static void main(String[] args)
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		
		Map<Integer,Integer> map = new HashMap();
		
		for(int i = 0; i < nums.length;i++)
		{
			map.put(nums[i],i);
		}
		
		//2. A +B = target, check B if inside of array, meantime map.get(B) != i; target = 4, 2 + 2;
		for(int i = 0; i < nums.length;i++)
		{
			int b = target - nums[i];
			if( map.containsKey(b) && map.get(b) != i)
			{
				System.out.println( Arrays.toString(new int[]{i,map.get(b)})); 
			}
		}
		//throw new IllegalArgumentException("No two sum solution");
	}

}
