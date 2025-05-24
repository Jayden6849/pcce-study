package day09;

public class Run {
	
	public static void main(String[] args) {
		// 1. 개미 군단
		System.out.println("===== 1번 ======");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution(23));
		System.out.println(s1.solution(24));
		System.out.println(s1.solution(999));
		
		// 2. 모스부호(1)
		System.out.println("===== 2번 ======");
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(".... . .-.. .-.. ---"));
		System.out.println(s2.solution(".--. -.-- - .... --- -."));
		
		// 3. 가위 바위 보
		System.out.println("===== 3번 ======");
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution("2"));
		System.out.println(s3.solution("205"));
		
		// 4. 구슬을 나누는 경우의 수
		System.out.println("===== 4번 ======");
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution(3, 2));
		System.out.println(s4.solution(5, 3));
	}
	
}
