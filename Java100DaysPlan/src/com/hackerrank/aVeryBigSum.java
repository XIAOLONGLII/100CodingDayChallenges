package com.hackerrank;

import java.util.Scanner;

/*You are given an array of integers of size . 
 * You need to print the sum of the elements in the array, 
 * keeping in mind that some of those integers may be quite large.

Input Format:
The first line of the input consists of an integer . 
The next line contains  space-separated integers contained in the array.

Output Format:
Print a single value equal to the sum of the elements in the array.
 * Sample input:
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 *
 * output:
 * 5000000015
 *
 */
public class aVeryBigSum
{
	

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers? ");
		int num = input.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = input.nextInt();
		}
		int result = bigSum(num,arr);
		System.out.println("The total are : " + result);
	}

	private static int bigSum(int num, int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	

}
