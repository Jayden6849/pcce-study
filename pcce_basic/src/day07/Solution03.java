package day07;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();

        while (start_num <= end_num) {
            list.add(start_num);
            start_num++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}
