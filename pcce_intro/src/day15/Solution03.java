package day15;

import java.util.Arrays;

public class Solution03 {

    public String solution(String s) {
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);

        String answer = "";
        String tmp = "";

        for(int i=0; i<chArr.length; i++) {
            if(!(tmp.contains(chArr[i] + ""))) {
                answer += chArr[i];
                tmp += chArr[i];
            } else if(tmp.contains(chArr[i] + "")) {
                answer = answer.replace(chArr[i]+"", "");
            }
        }

        return answer;
    }

}
