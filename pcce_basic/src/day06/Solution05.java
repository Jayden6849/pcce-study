package day06;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> resultList = new ArrayList<>();

        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;
            boolean found = false;

            for(int j=0; j<arr.length; j++) {
                if(s <= j && j <= e) {
                    if(k < arr[j] && arr[j] < min) {
                        min = arr[j];
                        found = true;
                    }
                }
            }

            if (found) {
                resultList.add(min);
            } else {
                resultList.add(-1);
            }
        }

        int[] answer = new int[resultList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = resultList.get(i);
        }



        return answer;
    }

}
