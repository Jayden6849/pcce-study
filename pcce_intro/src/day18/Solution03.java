package day18;

public class Solution03 {

    public int solution(int n, int t) {
        int answer = n;

        for (int i=0; i<t; i++) {
            answer *= 2;
        }

        return answer;
    }

}
