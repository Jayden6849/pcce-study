package day07;

public class Run {
	public static void main(String[] args) {
		// 1. 특정 문자 제거하기
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution("abcdef", "f"));
		System.out.println(s1.solution("BCBdbe", "B"));
		// 2. 각도기
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(70));
		System.out.println(s2.solution(91));
		System.out.println(s2.solution(180));
		// 3. 양꼬치
	}
}
