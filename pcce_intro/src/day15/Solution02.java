package day15;

public class Solution02 {

    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] chArr = my_string.toCharArray();

        char tmp;
        tmp = chArr[num1];
        chArr[num1] = chArr[num2];
        chArr[num2] = tmp;

        answer = new String(chArr);

        return answer;
    }

}
