package day11;

import java.util.ArrayList;

public class Solution02 {

    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=1; i<=n; i++) {
            if(i%k == 0)
                list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
