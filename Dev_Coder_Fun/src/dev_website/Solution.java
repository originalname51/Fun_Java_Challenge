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
	int solution(int arr[]) {
		long zeroToN[]  = new long[arr.length];		
		long nToZero[]  = new long[arr.length];
	             nToZero[0] = arr[0];		
		
		//To prevent overflow, copy array into long array.
		for(int i = 0; i < arr.length;i++)
		{
			zeroToN[i] = arr[i];
		}
		/*
		 * Length is -2 because the last number is unchanged and array is 0 indexed.
		 * Sum N->0
		 */
		for (int i = arr.length - 2; i > -1; i--) {
			zeroToN[i] = zeroToN[i] + zeroToN[i + 1];
		}		
		// Sum 0 -> N
		for (int i = 1; i < arr.length; i++) {
			nToZero[i] = nToZero[i - 1] + arr[i];
		}
		
		//Compare 0-> and N -> 0 for matches.
		boolean hasPivot = false;
		for (int i = 0; i < arr.length; i++) {
			if (zeroToN[i] == nToZero[i]) {
				arr[0] = i;
				hasPivot = true;
				break;
			}
		}
		return (hasPivot == false) ?  -1 : arr[0]; //return the first equilibrium index or -1
	}
}
