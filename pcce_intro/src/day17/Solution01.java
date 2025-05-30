package day17;

public class Solution01 {

    public int solution(int num, int k) {
        int answer = -1;

        char check = (char)(k + '0');

        String input = num+"";
        char[] chArr = input.toCharArray();

        for(int i=0; i<chArr.length; i++) {
            if(chArr[i] == check) {
                answer = i+1;
                break;
            }
        }

        return answer;
    }

}
