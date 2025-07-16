package day11;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 문자 개수 세기
        Solution01 s1 = new Solution01();
        System.out.println(Arrays.toString(s1.solution("Programmers")));

        // 2. 배열 만들기 1
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(10, 3)));
        System.out.println(Arrays.toString(s2.solution(15, 5)));

        // 3. 글자 지우기
        Solution03 s3 = new Solution03();

        // 4. 카운트 다운
        Solution04 s4 = new Solution04();

        // 5. 가까운 1 찾기
        Solution05 s5 = new Solution05();

    }

}
