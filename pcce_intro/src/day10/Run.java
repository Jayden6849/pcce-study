package day10;

import java.util.Arrays;

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
		System.out.println(Arrays.deepToString(s2.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2)));
		System.out.println(Arrays.deepToString(s2.solution(new int[] {100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
		
		// 3. 공 던지기
		System.out.println("===== 3번 ======");
		Solution03 s3 = new Solution03();
		System.out.println(s3.solution(new int[] {1, 2, 3, 4}, 2));
		System.out.println(s3.solution(new int[] {1, 2, 3, 4, 5, 6}, 5));
		System.out.println(s3.solution(new int[] {1, 2, 3}, 3));
		
		// 4. 배열 회전시키기
		System.out.println("===== 4번 ======");
		Solution04 s4 = new Solution04();
		System.out.println(Arrays.toString(s4.solution(new int[] {1, 2, 3}, "right")));
		System.out.println(Arrays.toString(s4.solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left")));
	}
	
}
