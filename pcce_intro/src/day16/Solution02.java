package day16;

public class Solution02 {

    public int[] solution(int[] array) {
        int max = 0;

        for (int i=0; i<array.length; i++)
            if(max <= array[i]) max = array[i];

        int cnt = 0;
        for (int i=0; i<array.length; i++) {
            if(array[i] == max) break;
            cnt++;
        }

        int[] answer = {max, cnt};
        return answer;
    }

}
