package day10;

public class Solution04 {

    public String solution(String my_string, int m, int c) {
        // 1. my_string을 잘라서 보관할 임의의 배열을 선언 및 ""로 초기화
        String[] strArr = new String[my_string.length()/m];
        for(int i=0; i<strArr.length; i++) {
            strArr[i] = "";
        }

        // 2. m개씩 잘라서 요소로 넣어줌
        for(int i=0; i<my_string.length(); i++) {
            strArr[i/m] += my_string.charAt(i);
        }

        // 3. 각 요소의 c번째 글자만 추출하여 문자열로 만듦
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strArr.length; i++) {
            sb.append(strArr[i].charAt(c-1));
        }

        // 4. StringBuilder -> String 후 반환
        return new String(sb);
    }

}
