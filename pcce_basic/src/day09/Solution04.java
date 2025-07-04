package day09;

import java.util.Arrays;

public class Solution04 {

    public String[] solution(String my_string) {
        // 연산이 많을 것이므로 my_string을 StringBuilder으로 변환 후 뒤집음
        StringBuilder sb = new StringBuilder(my_string);
        sb.reverse();

        // sb에서 추출해서 다시 뒤집은 후 answer의 요소로 넣어줌
        String[] answer = new String[sb.length()];
        for(int i=0; i<sb.length(); i++) {
            StringBuilder tmp = new StringBuilder(sb.substring(0, i+1));
            answer[i] = new String(tmp.reverse());
        }

        // 배열 answer를 사전순으로 정렬 후 반환
        Arrays.sort(answer);

        return answer;
    }

}
