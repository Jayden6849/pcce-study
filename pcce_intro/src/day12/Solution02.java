package day12;

import java.util.ArrayList;

public class Solution02 {

    public int[] solution(String my_string) {
        char[] chArr = my_string.toCharArray();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (char c : chArr) {
            if ('0' <= c && c <= '9')
                list.add(c-'0');
        }
        list.sort(Integer::compareTo);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
