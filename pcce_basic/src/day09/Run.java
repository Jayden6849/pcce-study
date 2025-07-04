package day09;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        // 1. 배열 만들기 5
        Solution01 s1 = new Solution01();
        System.out.println(Arrays.toString(s1.solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)));

        // 2. 부분 문자열 이어 붙여 문자열 만들기
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0,4}, {1,2}, {3,5}, {7,7}}));

        // 3. 문자열의 뒤의 n글자
        Solution03 s3 = new Solution03();

        // 4. 접미사 배열
        Solution04 s4 = new Solution04();

        // 5. 접미사인지 확인하기
        Solution05 s5 = new Solution05();

    }

}
