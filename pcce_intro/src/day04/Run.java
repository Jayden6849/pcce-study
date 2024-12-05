package day04;

public class Run {
	public static void main(String[] args) {
		// 1. 피자 나눠 먹기 (1)
		System.out.println("=== 1번 ===");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution(7));
		System.out.println(s1.solution(1));
		System.out.println(s1.solution(15));
		// 2. 피자 나눠 먹기 (2)
		System.out.println("=== 2번 ===");
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(6));
		System.out.println(s2.solution(10));
		System.out.println(s2.solution(4));
		// 3. 피자 나눠 먹기 (3)
		System.out.println("=== 3번 ===");
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution(7, 10));
		System.out.println(s3.solution(4, 12));
		// 4. 배열의 평균값
		System.out.println("=== 3번 ===");
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		System.out.println(s4.solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
	}
}