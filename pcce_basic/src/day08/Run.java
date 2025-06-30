package day08;

public class Run {

    public static void main(String[] args) {
        // 1. 간단한 논리 연산
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(false, true, true, true));
        System.out.println(s1.solution(true, false, false, false));

        // 2. 주사위 게임 3
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(2,2,2,2));
        System.out.println(s2.solution(4,1,4,4));
        System.out.println(s2.solution(6,3,3,6));
        System.out.println(s2.solution(2,5,2,6));
        System.out.println(s2.solution(6,4,2,5));

        // 3. 글자 이어 붙여 문자열 만들기
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(s3.solution("zpiaz", new int[]{1, 2, 0, 0, 3}));

        // 4. 9로 나눈 나머지
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution("123"));
        System.out.println(s4.solution("78720646226947352489"));

        // 5. 문자열 여러 번 뒤집기
        Solution05 s5 = new Solution05();
        System.out.println(s5.solution("rermgorpsam", new int[][]{{2,3}, {0,7}, {5,9}, {6,10}}));
    }

}
