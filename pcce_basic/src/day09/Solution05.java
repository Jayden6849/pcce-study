package day09;

public class Solution05 {

    public int solution(String my_string, String is_suffix) {
        int len1 = my_string.length(); // my_string의 길이
        int len2 = is_suffix.length(); // is_suffix의 길이

        if ((len1-len2) < 0)
            return 0;
        else
            return (my_string.substring(len1 - len2).equals(is_suffix)) ? 1 : 0;
    }

}
