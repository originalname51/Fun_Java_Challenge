package dev_website;

public class Solution_two {

	Solution_two() {
	}
	/*
	 * This algorithm will modify the input array.
	 * 
	 * It works the following way:
	 * 
	 * 1) Sum numbers
	 * 2) Go from 0 -> N deleting along the way. Any matches are pivot points.
	 * 
	 * Solution is O(1) space complexity, O(N) time.
	 * The solution will return the first index of a equilibrium OR -1.
	 * */
	int solution(int arr[]) 
	{
		long zeroToN;
		int pivotPoint = -1;
		long nToZeroSum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			nToZeroSum += arr[i];
		}
		zeroToN = arr[0];
		if(nToZeroSum == zeroToN)
		{
			return 0;
			
		}
		for(int i = 1; i < arr.length; i++)
		{
			zeroToN    += arr[i];
			nToZeroSum -= arr[i-1];
			if(nToZeroSum == zeroToN)
			{
				pivotPoint = i;
				break;
			}
		}
		return pivotPoint; // return first pivot point OR -1.
	}
}

