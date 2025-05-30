package day17;

import java.util.Arrays;

public class Solution02 {

    public int[] solution(int n, int[] numlist) {
        numlist = Arrays.stream(numlist)
                .filter(item -> item%n == 0)
                .toArray();

        return numlist;
    }

}
