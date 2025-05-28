package day11;

public class Run {
	
	public static void main(String[] args) {
		// 1. 주사위의 개수
		System.out.println("===== 1번 ======");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution(new int[]{1, 1, 1}, 1));
		System.out.println(s1.solution(new int[]{10, 8, 6}, 3));

		// 2. 합성수 찾기
		System.out.println("===== 2번 ======");
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(10));
		System.out.println(s2.solution(15));
		
		// 3. 최댓값 만들기(1)
		System.out.println("===== 3번 ======");
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution(new int[]{1, 2, 3, 4, 5}));
		System.out.println(s3.solution(new int[]{0, 31, 24, 10, 1, 9}));
		
		// 4. 팩토리얼
		System.out.println("===== 4번 ======");
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution(3628800));
		System.out.println(s4.solution(7));
	}
	
}
