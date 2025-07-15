package day10;

public class Run {

    public static void main(String[] args) {
        // 1. 문자열의 앞의 n글자
        Solution01 s1 = new Solution01();
        System.out.println(s1.solution("ProgrammerS123", 11));
        System.out.println(s1.solution("He110W0r1d", 5));

        // 2. 접두사인지 확인하기
        Solution02 s2 = new Solution02();
        System.out.println(s2.solution("banana", "ban"));
        System.out.println(s2.solution("banana", "nan"));
        System.out.println(s2.solution("banana", "abcd"));
        System.out.println(s2.solution("banana", "bananan"));

        // 3. 문자열 뒤집기
        Solution03 s3 = new Solution03();
        System.out.println(s3.solution("Progra21Sremm3", 6, 12));
        System.out.println(s3.solution("Stanley1yelnatS", 4, 10));

        // 4. 세로 읽기
        Solution04 s4 = new Solution04();
        System.out.println(s4.solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(s4.solution("programmers", 1, 1));

        // 5. qr code
        Solution05 s5 = new Solution05();
        System.out.println(s5.solution(3,1,"qjnwezgrpirldywt"));
        System.out.println(s5.solution(1,0,"programmers"));
    }

}
