package day03;

public class Run {

    public static void main(String[] args) {
        // 1. 문자열 섞기
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("aaaaa", "bbbbb"));

        // 2. 문자 리스트를 문자열로 변환하기
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(new String[]{"a", "b", "c"}));

        // 3. 문자열 곱하기
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("string", 3));
        System.out.println(s3.solution("love", 10));

        // 4. 더 크게 합치기
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution(9, 91));
        System.out.println(s4.solution(89, 8));

        // 5. 두 수의 연산값 비교하기
        Solution05 s5 = new Solution05();
        System.out.println(s5.solution(2, 91));
        System.out.println(s5.solution(91, 2));
    }

}
