package day11;

import java.util.ArrayList;

public class Solution04 {

    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=start_num; i>=end_num; i--) {
            list.add(i);
        }

        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

}
