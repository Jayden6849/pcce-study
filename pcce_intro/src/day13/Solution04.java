package day13;

import java.util.Arrays;

public class Solution04 {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        return ((sides[0] + sides[1]) > sides[2]) ? 1 : 2;
    }

}
