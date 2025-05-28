package day12;

public class Solution03 {

    public int solution(String my_string) {
        char[] chArr = my_string.toCharArray();
        int sum = 0;

        for (char ch : chArr) {
            if('1'<=ch && ch<='9')
                sum += Integer.parseInt(ch+"");
        }

        return sum;
    }

}
