package day05;

public class Solution02 {
    public int[] solution(int money) {
        final int PRICE = 5500;
        
        int cup = money/PRICE;
        int change = money - cup*PRICE;
        
        int[] answer = {cup, change};
        
        return answer;
    }
}
