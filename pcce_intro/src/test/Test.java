package test;

public class Test {
	public static void main(String args[]) {
			int balls = 100;
			int share = 99;
			
			long lBalls = balls;
			long lshare = share;
			
			int answer = 1;
			
//			answer = (factorial(balls) / (double)((factorial(share) * factorial(balls-share))));
		
			System.out.println(factorial(30));
			
			System.out.println(answer);
	  }
	
	private static long factorial(int n) {
        long result = 1;
        for(long i=1; i<=n; i++) { 
            result *= i;
        }
        return result;
    }
}
