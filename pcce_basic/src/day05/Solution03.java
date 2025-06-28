package day05;

public class Solution03 {

    public int solution(int a, int b, int c) {
        int score = 0;

        // 모두 같다면? 두 개만 같다면? 모두 다르다면?
        if(a==b && b==c && c==a) {
            score = (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
        } else if(a==b || b==c || c==a) {
            score = (a+b+c) * (a*a+b*b+c*c);
        } else {
            score = (a+b+c);
        }

        return score;
    }

}
