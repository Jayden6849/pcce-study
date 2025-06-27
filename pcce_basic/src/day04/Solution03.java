package day04;

public class Solution03 {

    public int solution(int n) {
        int sumCase1 = 0;
        int sumCase2 = 0;

        for (int i=1; i<=n; i++) {
            if(i%2 != 0) sumCase1 += i;
            else sumCase2 += i * i;
        }
        return (n%2 != 0) ? sumCase1 : sumCase2 ;
    }

}
