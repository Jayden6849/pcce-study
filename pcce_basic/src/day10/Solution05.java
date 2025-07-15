package day10;

public class Solution05 {

    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<code.length(); i++) {
            if(i%q == r) {
                answer.append(code.charAt(i));
            }
        }

        return new String(answer);
    }

}
