package day05;

public class Solution01 {

    public String solution(String code) {
        String answer ="";

        StringBuilder result = new StringBuilder();

        boolean mode = false;
        for(int i=0; i<code.length(); i++) {
            if("1".equals(String.valueOf(code.charAt(i)))) {
                mode = !mode;
            } else {
                if(!mode) {
                    // mode 0일때
                    if(i%2 == 0) {
                        result.append(code.charAt(i));
                    }
                } else {
                    // mode 1일떄
                    if(i%2 == 1) {
                        result.append(code.charAt(i));
                    }
                }
            }
        }

        answer = result.toString();

        if("".equals(answer) || answer.length() == 0) {
            answer = "EMPTY";
        }

        return answer;
    }

}
