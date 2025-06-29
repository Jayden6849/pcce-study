package day07;

import java.util.Arrays;

public class Solution01 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<queries.length; j++) {
                if(queries[j][0] <= i && i <= queries[j][1]) {
                    if(i%queries[j][2] == 0) {
                        answer[i] += 1;
                    }
                }
            }
        }

        return answer;
    }

}
