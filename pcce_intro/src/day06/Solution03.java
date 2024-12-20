package day06;

public class Solution03 {
	public int[] solution(int[] num_list) {
        // 1. 정답을 담을 임의의 정수배열을 선언하고 생성
        int[] answer = new int[2];
        
        // 2. 홀수의 개수, 짝수의 개수를 담을 변수를 선언, 초기화
        int cntOdd = 0, cntEven = 0;
        
        // 3. 매개변수로 받은 배열을 반복문 돌려서 홀수일 떄 , 짝수일 때 각각 로직을 만듦
        for (int i=0; i<num_list.length; i++) {
            if(num_list[i]%2 == 1) {
                cntOdd++;
            } else {
                cntEven++;
            }
        }
        
        // 4. 제출할 배열에 개수를 담아줌
        answer[0] = cntEven;
        answer[1] = cntOdd;

        return answer;
    }
}
