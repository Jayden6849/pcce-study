package day14;

public class Solution03 {

    public String solution(String cipher, int code) {

        char[] chArr = cipher.toCharArray();

        String answer = "";
        for (int i = code-1; i<chArr.length; i += code) {
            answer += chArr[i] + "";
        }

        return answer;
    }

}
