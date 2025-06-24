package day03;

public class Solution05 {

    public int solution(int a, int b) {
        String strSum = (a + "") + (b + "");
        int intSum = Integer.parseInt(strSum);

        return (intSum >= 2*a*b) ? intSum : 2*a*b;
    }

}
