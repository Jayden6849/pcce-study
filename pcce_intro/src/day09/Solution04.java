package day09;

import java.math.BigInteger;

public class Solution04 {
	
	public int solution(int balls, int share) {
        int answer = 1;
		
		answer = factorial(balls).divide((factorial(share).multiply(factorial(balls-share)))).intValue();
		
        return answer;
    }
    
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        
        for(int i=1; i<=n; i++) { 
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
	
}
