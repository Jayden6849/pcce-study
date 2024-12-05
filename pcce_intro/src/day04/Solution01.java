package day04;

public class Solution01 {
    public int solution(int n) {
        final int DIV = 7;
        
        return n%DIV == 0 ? n/DIV : n/DIV + 1;
    }
}
