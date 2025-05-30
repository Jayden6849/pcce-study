package day17;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 숫자 찾기
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(29183, 1));
        System.out.println(s1.solution(232443, 4));
        System.out.println(s1.solution(123456, 7));

        // 2. n의 배수 고르기
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(s2.solution(5, new int[] {1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(s2.solution(12, new int[] {2, 100, 120, 600, 12, 12})));

        // 3. 자릿수 더하기
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(1234));
        System.out.println(s3.solution(930211));

        // 4. OX 퀴즈
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(s4.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }

}
