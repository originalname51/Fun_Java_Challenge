package dev_website;
public class Solution {

	Solution() {
	}
	/*
	 * This algorithm will modify the input array. 
	 * It takes 2N space to complete, but only N additional space from input array. 
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
		
		int second_array[] = new int[arr.length];
		second_array[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			second_array[i] = second_array[i - 1] + arr[i];
		}
		
		/*
		 * Length is -2 because the last number is unchanged and array is 0 indexed.
		 */
		for (int i = arr.length - 2; i > -1; i--) {
			arr[i] = arr[i] + arr[i + 1];
		}
		
		boolean hasPivot = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == second_array[i]) {
				arr[0] = i;
				hasPivot = true;
				break;
			}
		}
		return (hasPivot == false) ?  -1 : arr[0]; //return the first equilibrium index or -1
	}
}
