package day10;

public class Run {
	
	public static void main(String[] args) {
		// 1. 점의 위치 구하기
		System.out.println("===== 1번 ======");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution(new int[] {2, 4}));
		System.out.println(s1.solution(new int[] {-7, 9}));
		
		// 2. 2차원으로 만들기
		System.out.println("===== 2번 ======");
		Solution02 s2 = new Solution02();
		
		
		// 3. 공 던지기
		System.out.println("===== 3번 ======");
		Solution03 s3 = new Solution03();
		
		// 4. 배열 회전시키기
		System.out.println("===== 4번 ======");
		Solution04 s4 = new Solution04();
	}
	
}
