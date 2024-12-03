package day02;

public class Solution03 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		
		int i = 1;
		for(i=1; i<1000; i++) {
			if (i%denom1 == 0 && i%denom2 == 0) {
				answer[1] = i;
				answer[0] = numer1 * (answer[1]/denom1) + numer2 * (answer[1]/denom2);
				break;
			}
		}
				
        return answer;
    }
}
