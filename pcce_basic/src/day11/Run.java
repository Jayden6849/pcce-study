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
        System.out.println(s3.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));

        // 4. 카운트 다운
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(10, 3)));

        // 5. 가까운 1 찾기
        Solution05 s5 = new Solution05();
        System.out.println(s5.solution(new int[]{0,0,0,1}, 1));
        System.out.println(s5.solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(s5.solution(new int[]{1, 1, 1, 1, 0}, 3));
    }

}
