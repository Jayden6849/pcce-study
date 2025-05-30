package day18;

public class Solution04 {

    public String solution(String my_string) {
        String answer = "";
        String low = my_string.toLowerCase();

        char[] chArr = low.toCharArray();

        char tmp = ' ';
        for(int i=0; i<chArr.length-1; i++) {
            for(int j=i; j<chArr.length; j++) {
                if(chArr[i] > chArr[j]) {
                    tmp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = tmp;
                }
            }
        }

        answer = new String(chArr);

        return answer;
    }

}
