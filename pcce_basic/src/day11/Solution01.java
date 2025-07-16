package day11;

public class Solution01 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(65 <= ch && ch <= 90) {
                answer[ch-65] += 1;
            } else if(97 <= ch && ch <= 125) {
                answer[ch-71] += 1;
            }
        }

        return answer;
    }

}
