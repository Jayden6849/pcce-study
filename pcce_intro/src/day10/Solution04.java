package day10;

public class Solution04 {
	
	public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if("right".equalsIgnoreCase(direction)) {
            answer[0] = numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
        } else if("left".equalsIgnoreCase(direction)) {
            answer[numbers.length-1] = numbers[0];
            for(int i=0; i<numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
        }
        
        return answer;
    }
	
}
