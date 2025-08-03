package day14;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 홀수 vs 짝수
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(new int[] {4, 2, 6, 1, 7, 6}));
        System.out.println(s1.solution(new int[] {-1, 2, 5, 6, 3}));

        // 2. 5명씩
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));

        // 3. 할 일 목록
        Solution03 s3 = new Solution03();
        System.out.println(Arrays.toString(s3.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})));

        // 4. n보다 커질 때까지 더하기
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(new int[] {34, 5, 71, 29, 100, 34}, 123));
        System.out.println(s4.solution(new int[] {58, 44, 27, 10, 100}, 139));

        // 5. 수열과 구간 쿼리 1
        Solution05 s5 = new Solution05();
    }

}
