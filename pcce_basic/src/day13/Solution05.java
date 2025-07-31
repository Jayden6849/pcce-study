package day13;

import java.util.ArrayList;

public class Solution05 {

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<num_list.length; i = i+n){
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
