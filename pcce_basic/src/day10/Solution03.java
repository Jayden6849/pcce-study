package day10;

public class Solution03 {

    public String solution(String my_string, int s, int e) {
        // 1. 해당하는 부분을 추출하여 sb에 담아둠
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));

        // 2. sb에 해당하는 부분을 뒤집어서 my_string에 재할당
        my_string = my_string.replace(new String(sb), new String(sb.reverse()));

        // 3. 반환
        return my_string;
    }

}
