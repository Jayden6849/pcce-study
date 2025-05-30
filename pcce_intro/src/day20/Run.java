package day20;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 직사각형의 넓이 구하기
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(new int[][]{{1, 1},{2, 1},{2, 2},{1, 2}}));
        System.out.println(s1.solution(new int[][]{{-1, -1},{1, 1},{1, -1},{-1, 1}}));

        // 2. 캐릭터의 좌표
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(s2.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));

        // 3. 최댓값 만들기 (2)
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(s3.solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(s3.solution(new int[]{10, 20, 30, 5, 5, 20, 5}));

        // 4. 다항식 더하기
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution("3x + 7 + x"));
        System.out.println(s4.solution("x + x + x"));
    }

}
