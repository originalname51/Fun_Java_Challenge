
package dev_website;

public class Solution {

	Solution() {
	}
	/*
	 * This algorithm will modify the input array.
	 * 
	 * It works the following way:
	 * 
	 * 1) Sum numbers 0 - > N in one array. (e.g. 1,0,1,1 becomes 1,1,2,3).
	 * 2) Sum numbers N - > 0 in a new Array of N numbers. (e.g. 1,0,1,1 becomes 3,2,2,1)
	 * 3) Iterate over the arrays. Matches between the two arrays are pivot points.
	 * 
	 * The solution will return the first index of a equilibrium OR -1.
	 * */
	int solution(int arr[]) 
	{
		long  nToZero[]  = new long[arr.length];		
		long  zeroToN[]  = new long[arr.length];
		long temp;
		
		temp = arr[0];
		for(int i = 1; i < zeroToN.length; i++)
		{
			zeroToN[i] = temp + arr[i];
			temp = zeroToN[i];
		}
		
		temp = nToZero[nToZero.length-1] =  arr[arr.length-1];    //set the last value of nToZero as well as temp value to last array value.
		for(int i = arr.length-2; i > -1; i--)
		{
			nToZero[i] = temp + arr[i];
			temp = nToZero[i];
		}

		//Compare 0-> and N -> 0 for matches.	
		int pivotPoint = -1;
		for (int i = 0; i < arr.length; i++) {
			if (nToZero[i] == zeroToN[i]) {
				pivotPoint = i;
				break;
			}
		}
		return pivotPoint; // return first pivot point OR -1.
	}
}

