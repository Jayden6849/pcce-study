package day09;

import java.util.Arrays;

public class Solution01 {

    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};

        for (String intStr : intStrs) {
            String temp = intStr.substring(s, s + l);

            int value = Integer.parseInt(temp);

            if(value > k) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = value;
            }
        }

        return answer;
    }

}
