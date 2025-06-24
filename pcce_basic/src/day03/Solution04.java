package day03;

public class Solution04 {

    public int solution(int a, int b) {
        String ab = a + "" + b;
        int num1 = Integer.parseInt(ab);
        String ba = b + "" + a;
        int num2 = Integer.parseInt(ba);

        if(num1 >= num2) return num1;
        else return num2;
    }

}
