package day18;

public class Run {

    public static void main(String[] args) {
        // 1. 문자열 안에 문자열
        System.out.println("===== 1번 ======");
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(s1.solution("ppprrrogrammers", "pppp"));
        System.out.println(s1.solution("AbcAbcA", "AAA"));

        // 2. 제곱수 판별하기
        System.out.println("===== 2번 ======");
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution(144));
        System.out.println(s2.solution(976));

        // 3. 세균 증식
        System.out.println("===== 3번 ======");
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution(2, 10));
        System.out.println(s3.solution(7, 15));

        // 4. 문자열 정렬하기 (2)
        System.out.println("===== 4번 ======");
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution("Bcad"));
        System.out.println(s4.solution("heLLo"));
        System.out.println(s4.solution("Python"));
    }

}
