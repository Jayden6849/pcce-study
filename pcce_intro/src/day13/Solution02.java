package day13;

import java.util.Arrays;

public class Solution02 {

    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

}
