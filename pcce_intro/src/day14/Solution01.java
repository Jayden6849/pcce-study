package day14;

import java.util.Arrays;

public class Solution01 {

    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int diff = 0;
        int min = Math.abs(n - array[0]);
        int target = 0;

        for(int i=0; i<array.length; i++) {
            diff = Math.abs(n - array[i]);

            if(min > diff) {
                min = diff;
                target = i;
            }
        }
        return array[target];
    }

}
