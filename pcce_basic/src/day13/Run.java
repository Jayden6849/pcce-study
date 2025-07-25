package day13;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. n번째 원소부터
        Solution01 s1 = new Solution01();
        System.out.println(Arrays.toString(s1.solution(new int[]{2, 1, 6}, 3)));
        System.out.println(Arrays.toString(s1.solution(new int[]{5, 2, 1, 7, 5}, 2)));

        // 2. 순서 바꾸기
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(s2.solution(new int[]{5, 2, 1, 7, 5}, 3)));

        // 3. 왼쪽 오른쪽
        Solution03 s3 = new Solution03();
        System.out.println(Arrays.toString(s3.solution(new String[] {"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(s3.solution(new String[] {"l"})));

        // 4. n번째 원소까지

        // 5. n개 간격의 원소들
    }

}
