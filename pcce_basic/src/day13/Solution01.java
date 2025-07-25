package day13;

import java.util.ArrayList;

public class Solution01 {

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<num_list.length; i++) {
            if(i < n-1) continue;
            else list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
