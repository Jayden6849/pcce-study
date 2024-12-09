package day05;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		// 1. 옷가게 할인 받기
		System.out.println("=== 1번 ===");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution(150000));
		System.out.println(s1.solution(580000));
		// 2. 아이스 아메리카노
		System.out.println("=== 2번 ===");
		Solution02 s2 = new Solution02();
		System.out.println(Arrays.toString(s2.solution(5500)));
		System.out.println(Arrays.toString(s2.solution(15000)));
		// 3. 나이 출력
		System.out.println("=== 3번 ===");
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution(40));
		System.out.println(s3.solution(23));
		// 4. 배열 뒤집기
		System.out.println("=== 4번 ===");
		Solution04 s4 = new Solution04();
		System.out.println(Arrays.toString(s4.solution(new int[] {1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(s4.solution(new int[] {1, 1, 1, 1, 1, 2})));
		System.out.println(Arrays.toString(s4.solution(new int[] {1, 0, 1, 1, 1, 3, 5})));
	}
}
