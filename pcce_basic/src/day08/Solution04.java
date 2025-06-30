package day08;

public class Solution04 {

    public int solution(String number) {
        char[] chArr = number.toCharArray();

        int sum=0;
        for(int i=0; i<chArr.length; i++) {
            sum += chArr[i]-'0';
        }
        return sum%9;
    }

}
