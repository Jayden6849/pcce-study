package day07;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 수열과 구간 쿼리 4
        Solution01 s1 = new Solution01();
        System.out.println(Arrays.toString(s1.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));

        // 2. 배열 만들기 2
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(5, 555)));
        System.out.println(Arrays.toString(s2.solution(10, 20)));

        // 3. 카운트 업
        Solution03 s3 = new Solution03();
        System.out.println(Arrays.toString(s3.solution(3, 10)));

        // 4. 콜라츠 수열 만들기
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(10)));

        // 5. 배열 만들기 4
        Solution05 s5 = new Solution05();
        System.out.println(Arrays.toString(s5.solution(new int[]{1,4,2,5,3})));
    }

}
