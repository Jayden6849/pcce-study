package day13;

import day13.Solution01;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 컨트롤 제트
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("1 2 Z 3"));
        System.out.println(s1.solution("10 20 30 40"));
        System.out.println(s1.solution("10 Z 20 Z 1"));
        System.out.println(s1.solution("10 Z 20 Z"));
        System.out.println(s1.solution("-1 -2 -3 Z"));

        // 2. 배열 원소의 길이
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(new String[]{"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(s2.solution(new String[]{"I", "Love", "Programmers."})));

        // 3. 중복된 문자 제거
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("people"));
        System.out.println(s3.solution("We are the world"));

        // 4. 삼각형의 완성조건 (1)
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(new int[]{1, 2, 3}));
        System.out.println(s4.solution(new int[]{3, 6, 2}));
        System.out.println(s4.solution(new int[]{199, 72, 222}));
    }

}
