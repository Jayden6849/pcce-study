package day06;

public class Solution01 {
    public String solution(String my_string) {
    	// 1. 매개변수로 받은 문자열을 문자배열로 변환
        char[] chArr = my_string.toCharArray();
        
        // 2. 문자배열 길이의 절반까지만 바복문 돌려서 대응하는 요소의 위치를 바꾸어줌
        for (int i=0; i<(chArr.length)/2; i++) {
            char tmp = chArr[i];
            chArr[i] = chArr[chArr.length - i - 1];
            chArr[chArr.length - i - 1] = tmp;
        }
        
        // 3. 문자배열을 다시 문자열로 반환하여 반환
        String answer = new String(chArr);
        
        return answer;
    }
}
