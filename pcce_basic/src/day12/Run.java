package day12;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 리스트 자르기
        Solution01 s1 = new Solution01();
        System.out.println(Arrays.toString(s1.solution(3, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(s1.solution(4, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));

        // 2. 첫 번째로 나오는 음수
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(new int[] {12, 4, 15, 46, 38, -2, 15}));
        System.out.println(s2.solution(new int[] {13, 22, 53, 24, 15, 6}));
        // 3. 배열 만들기 3
        Solution03 s3 = new Solution03();
        System.out.println(Arrays.toString(s3.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));

        // 4. 2의 영역
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(s4.solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(s4.solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(s4.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));

        // 5. 배열 조각하기
        Solution05 s5 = new Solution05();
        System.out.println(Arrays.toString(s5.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }

}
