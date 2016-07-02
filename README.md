# Fun_Java_Challenge
Solution to the problem on http://devtechnology.com/dev-technology-code-jam/

Problem:

Write a function:
class Solution { public int solution(int[] A); }
such that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.
For example, given array A shown above, the function may return 1, 3 or 7, as explained above.
Assume that:
N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

Algorithm is as follows:


	 * It works the following way:
	 * 
	 * 1) Sum numbers 0 - > N in one array. (e.g. 1,0,1,1 becomes 1,1,2,3).
	 * 2) Sum numbers N - > 0 in a new Array of N numbers. (e.g. 1,0,1,1 becomes 3,2,2,1)
	 * 3) Iterate over the arrays. Matches between the two arrays are pivot points.
	 * 
This has a complexity of 3N which is O(N) worst case.
This has a space complexity of input storage + N (2N). Because it does not count the storage for input arguments it is just N.
This will modify the input array elements.
While the algorithm can be modified to easily return an array of pivot points this is outside of the scope of what is asked. Instead it returns the first pivot point of the array OR -1 if there is not a pivot point.

