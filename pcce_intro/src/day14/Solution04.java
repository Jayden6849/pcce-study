package day14;

public class Solution04 {

    public String solution(String my_string) {
        String answer = "";

        char[] chArr = my_string.toCharArray();

        for (int i=0; i<chArr.length; i++) {
            if ('a' <= chArr[i] && chArr[i] <= 'z')
                chArr[i] -= 32;
            else if('A' <= chArr[i] && chArr[i] <= 'Z')
                chArr[i] += 32;
        }
        answer = new String(chArr);

        return answer;
    }

}
