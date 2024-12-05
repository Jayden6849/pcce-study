package day04;

public class Solution03 {
    public int solution(int slice, int n) {
        double result = n / (double) slice;
        return (int)Math.ceil(result);
    }
}
