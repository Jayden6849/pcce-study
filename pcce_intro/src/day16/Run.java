package day16;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        // 1. 편지
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("happy birthday!"));
        System.out.println(s1.solution("I love you~"));

        // 2. 가장 큰 수 찾기
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(new int[] {1, 8, 3})));
        System.out.println(Arrays.toString(s2.solution(new int[] {9, 10, 11, 8})));

        // 3. 문자열 계산하기
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("3 + 4"));

        // 4. 배열의 유사도
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"}));
        System.out.println(s4.solution(new String[] {"n", "omg"}, new String[] {"m", "dot"}));
    }

}
