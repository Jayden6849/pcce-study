package day07;

public class Run {
	public static void main(String[] args) {
		// 1. 특정 문자 제거하기
		System.out.println("===== 1번 ======");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution("abcdef", "f"));
		System.out.println(s1.solution("BCBdbe", "B"));
		// 2. 각도기
		System.out.println("===== 2번 ======");
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(70));
		System.out.println(s2.solution(91));
		System.out.println(s2.solution(180));
		// 3. 양꼬치
		System.out.println("===== 3번 ======");
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution(10, 3));
		System.out.println(s3.solution(64, 6));
		// 4. 짝수의 합
		System.out.println("===== 4번 ======");
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution(10));
		System.out.println(s4.solution(4)	);
	}
}
