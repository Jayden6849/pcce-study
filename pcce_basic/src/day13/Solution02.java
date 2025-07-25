package day13;

import java.util.ArrayList;

public class Solution02 {

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i=0; i<n; i++){
            list1.add(num_list[i]);
        }
        for (int i=n; i<num_list.length; i++) {
            list2.add(num_list[i]);
        }

        list2.addAll(list1);

        return list2.stream().mapToInt(Integer::intValue).toArray();

    }

}
