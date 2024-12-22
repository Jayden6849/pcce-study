package day06;

public class Solution04 {
	public String solution(String my_string, int n) {
		// 1. 정답을 제출할 임의의 변수 선언 및 초기화
		String answer = "";
		
		// 2. 매개변수로 들어온 문자열을 문자배열로 변환
	    char[] chArr = my_string.toCharArray();
	    
	    // 3. 이중 반복문을 돌려서 answer에 문자를 더하는 절차가 n번 반복되도록 구성
	    for (int i=0; i<chArr.length; i++) {
	        for (int j=0; j<n; j++) {
	            answer += (chArr[i] + "");
	        }
	    }
	    return answer;
   }
}
