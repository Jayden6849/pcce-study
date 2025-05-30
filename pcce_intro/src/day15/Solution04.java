package day15;

public class Solution04 {

    public int[] solution(int n) {
        int[] temp = new int[1000];

        int cnt=0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                temp[cnt] = i;
                cnt++;
            }
        }

        int length = 0;

        for(int i=0; i<temp.length; i++) {
            if(temp[i] != 0) length = i+1;
        }

        int[] answer = new int[length];

        for(int i=0; i<answer.length; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }

}
