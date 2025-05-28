package day13;

public class Solution03 {

    public String solution(String my_string) {
        String answer = "";

        char[] chArr = my_string.toCharArray();
        for(int i=0; i<chArr.length; i++) {
            if(!(answer.contains(chArr[i]+"")))
                answer += chArr[i];
        }
        return answer;
    }

}
