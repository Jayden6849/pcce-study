package day06;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 마지막 두 원소
        Solution01 s1 = new Solution01();
        System.out.println(Arrays.toString(s1.solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(s1.solution(new int[]{5,2,1,7,5})));

        // 2. 수 조작하기 1
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(0, "wsdawsdassw"));

        // 3. 수 조작하기 2
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));

        // 4. 수열과 구간 쿼리 3
        Solution04 s4 = new Solution04();
        System.out.println(Arrays.toString(s4.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0,3},{1,2},{1,4}})));

        // 5. 수열과 구간 쿼리 2
        Solution05 s5 = new Solution05();
        System.out.println(Arrays.toString(s5.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }

}
