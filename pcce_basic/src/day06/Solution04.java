package day06;

public class Solution04 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        answer = arr.clone();
        for(int i=0; i<queries.length; i++) {
            int aIndex = queries[i][0];
            int bIndex = queries[i][1];

            int aValue = answer[aIndex];
            int bValue = answer[bIndex];

            answer[bIndex] = aValue;
            answer[aIndex] = bValue;
        }

        return answer;
    }

}
