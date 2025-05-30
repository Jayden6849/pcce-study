package day19;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 7의 개수
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(new int[]{7, 77, 17}));
        System.out.println(s1.solution(new int[]{10, 29}));

        // 2. 잘라서 배열로 저장하기
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(Arrays.toString(s2.solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(s2.solution("abcdef123", 3)));

        // 3. 중복된 숫자 개수
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(s3.solution(new int[]{0, 2, 3, 4}, 1));

        // 4. 머쓱이보다 키 큰 사람
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(s4.solution(new int[]{180, 120, 140}, 190	));
    }

}
