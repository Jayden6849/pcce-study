package day14;

public class Run {

    public static void main(String[] args) {
        // 1. 가까운 수
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(new int[]{3, 10, 28}, 20) );
        System.out.println(s1.solution(new int[]{10, 11, 12}, 13) );

        // 2. 369게임
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(3));
        System.out.println(s2.solution(29423));

        // 3. 암호 해독
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(s3.solution("pfqallllabwaoclk", 2));

        // 4. 대문자와 소문자
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution("cccCCC") );
        System.out.println(s4.solution("abCdEfghIJ") );

    }

}
