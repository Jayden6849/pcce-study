package day19;

import java.util.ArrayList;
import java.util.Collections;

public class Solution04 {

    public int solution(int[] array, int height) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i< array.length; i++) {
            list.add(array[i]);
        }
        list.add(height);
        list.sort(Integer::compareTo);
        Collections.reverse(list);

        int answer = list.indexOf(height);

        return answer;
    }

}
