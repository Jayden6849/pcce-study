package day05;

public class Solution01 {
    public int solution(int price) {    
        double discountRate = 0.0;
        
        if (price >= 500000)
            discountRate = 0.2;
        else if (price >= 300000)
            discountRate = 0.1;
        else if (price >= 100000)
            discountRate = 0.05;
        
        price *= 1 - discountRate;

        return price;
    }
}
