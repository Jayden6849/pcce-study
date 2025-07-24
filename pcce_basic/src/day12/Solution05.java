package day12;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();

        for(int i: arr) {
            list.add(i);
        }

        for(int i=0; i<query.length; i++) {
            if(i%2 == 0) {
                for(int j=list.size()-1; j>query[i]; j--) {
                    list.remove(j);
                }
            } else {
                for(int j=query[i]; j>0; j--) {
                    list.remove(0);
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
