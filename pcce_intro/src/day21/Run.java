package day21;

public class Run {

    public static void main(String[] args) {
        // 1. 숨어있는 숫자의 덧셈 (2)
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("aAb1B2cC34oOp"));
        System.out.println(s1.solution("1a2b3c4d123Z"));

        // 2. 안전지대
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(s2.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(s2.solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));

        // 3. 삼각형의 완성조건 (2)
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(new int[]{1, 2}));
        System.out.println(s3.solution(new int[]{3, 6}));
        System.out.println(s3.solution(new int[]{11, 7}));

        // 4. 외계어 사전
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(s4.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(s4.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

}
