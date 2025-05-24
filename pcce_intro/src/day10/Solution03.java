package day10;

public class Solution03 {
	
	public int solution(int[] numbers, int k) {
        int answer = numbers[0];
            
        answer += 2*(k-1);

        while(true) {
            if(numbers.length < answer)
                answer -= numbers.length;
            else
                break;
        }

        return answer;
    }
	
}
