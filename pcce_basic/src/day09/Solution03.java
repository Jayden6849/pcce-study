package day09;

public class Solution03 {

    public String solution(String my_string, int n) {
        int len = my_string.length();

        return my_string.substring(len-n);
    }

}
