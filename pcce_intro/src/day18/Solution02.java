package day18;

public class Solution02 {

    public int solution(int n) {
        int answer = 2;

        for(int i=1; ;i++) {
            if(n == i*i) {
                answer = 1;
                break;
            }
            if(1000000 < i*i)
                break;
        }

        return answer;
    }

}
