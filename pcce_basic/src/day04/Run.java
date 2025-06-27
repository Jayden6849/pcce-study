package day04;

public class Run {

    public static void main(String[] args) {
        // 1. n의 배수
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution(98, 2));
        System.out.println(s1.solution(34, 3));

        // 2. 공배수
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(60, 2, 3));
        System.out.println(s2.solution(55, 10, 5));

        // 3. 홀짝에 따라 다른 값 반환하기
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(7));
        System.out.println(s3.solution(10));

        // 4. 조건 문자열
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution("<", "=", 20, 50));
        System.out.println(s4.solution(">", "!", 41, 78));

        // 5. flag에 따라 다른 값 반환하기
        Solution05 s5 = new Solution05();
        System.out.println(s5.solution(-4, 7, true));
        System.out.println(s5.solution(-4, 7, false));


    }

}
