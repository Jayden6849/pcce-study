package day13;

public class Solution01 {

    public int solution(String s) {
        int answer = 0;

        // s를 공백을 기준으로 문자열배열로 바꾼 후
        String[] strArr = s.split(" ");

        // strArr에 "Z"가 나타날 때마다 행할 동작을 구현
        for(int i=0; i<strArr.length; i++) {
            if("Z".equals(strArr[i])) {
                answer -= Integer.parseInt(strArr[i-1]);
                continue;
            }
            answer += Integer.parseInt(strArr[i]);
        }

        return answer;
    }

}
