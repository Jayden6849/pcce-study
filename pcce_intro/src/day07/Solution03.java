package day07;

public class Solution03 {
	public int solution(int n, int k) {
		final int LAMB = 12000;
	    final int DRINK = 2000;
	        
	    k -= n/10;
	        
	    int result = n * LAMB + k * DRINK;
	        
	    return result;
	}
}
