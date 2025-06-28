package day05;

public class Run {

    public static void main(String[] args) {
        // 1. 코드 처리하기
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("abc1abc1abc"));

        // 2. 등차수열의 특정한 한만 더하기
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(3, 4, new boolean[]{true, false, false, true, true}));
        System.out.println(s2.solution(7, 1, new boolean[]{false, false, false, true, false, false, false}));

        // 3. 주사위 게임 2
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(2, 6, 1));
        System.out.println(s3.solution(5, 3, 3));
        System.out.println(s3.solution(4, 4, 4));

        // 4. 원소들의 곱과 합
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(s4.solution(new int[]{5, 7, 8, 3}));

        // 5. 이어 붙인 수
        Solution05 s5 = new Solution05();
        System.out.println(s5.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(s5.solution(new int[]{5, 7, 8, 3}));
    }

}
