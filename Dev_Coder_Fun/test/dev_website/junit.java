package dev_website;

import org.junit.Test;
import junit.framework.TestCase;

public class junit extends TestCase {

	@Test
	public void test() {
		int A[] = {1,0,1};
		int B[] = {-1, 3,-4, 5, 1, -6, 2, 1};
		int C[] = {2,5,0,5,2,0};		
	    int D[] = {100000,5,2,1,-12526,4,3,1,100000};
	    int E[] = {1,2,3,4,5,6,7,8,9,10,0,5};
	    int F[] = {0,0,0,0,0,0,0,0,0,1};
	    int G[] = {2147483647,2147483647,0,2147483647,2147483647,0,0};

	    int H[] = new int[99999];
	    
	    for(int i = 0; i < H.length; i++)
	    {
	    	H[i] = 2147483647;
	    }
	    
	    Solution Dov = new Solution();	
		assertTrue(Dov.solution(A) == 1);
		assertTrue(Dov.solution(B) == 1);
		assertTrue(Dov.solution(C) == 2);
		assertTrue(Dov.solution(D) == 4);
		assertTrue(Dov.solution(E) == -1);
		assertTrue(Dov.solution(F) == 9);
		assertTrue(Dov.solution(G) == 2);
		assertTrue(Dov.solution(H) == 49999);

	}

}
