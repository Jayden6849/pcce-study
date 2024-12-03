package day02;

public class Solution03 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = {};
		
		int tmp = 1;
		while(true) {
			if (tmp%denom1 == 0 && tmp%denom2 == 0) {
				System.out.println(tmp);
				break;
			}
		}
		
        return answer;
    }
}
