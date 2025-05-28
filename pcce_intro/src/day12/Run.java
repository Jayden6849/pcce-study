package day12;

import day12.Solution01;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 모음제거
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("bus"));
        System.out.println(s1.solution("nice to meet youO"));

        // 2. 문자열 정렬하기 (1)
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution("hi12392")));
        System.out.println(Arrays.toString(s2.solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(s2.solution("abcde0")));

        // 3. 숨어있는 숫자의 덧셈 (1)
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("aAb1B2cC34oOp"));
        System.out.println(s3.solution("1a2b3c4d123"));

        // 4. 소인수분해
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(12)));
        System.out.println(Arrays.toString(s4.solution(17)));
        System.out.println(Arrays.toString(s4.solution(420)));
    }

}
