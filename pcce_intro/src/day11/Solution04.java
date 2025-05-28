package day11;

public class Solution04 {

    public int solution(int n) {
        int result = 1;

        int i=1;
        while(true) {
            result *= i;
            if(n < result) {
                break;
            }
            i++;
        }

        return i-1;
    }
	
}
