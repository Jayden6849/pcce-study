package day06;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		// 1. 문자열 뒤집기
		System.out.println("=== 1번 ===");
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution("jaron"));
		System.out.println(s1.solution("bread"));
		// 2. 직각삼각형 출력하기
		System.out.println("=== 2번 ===");
		Solution02 s2 = new Solution02();
		s2.solution();
		// 3. 짝수 홀수 개수
		System.out.println("=== 3번 ===");
		Solution03 s3 = new Solution03();
		System.out.println(Arrays.toString(s3.solution(new int[] {1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(s3.solution(new int[] {1, 3, 5, 7})));	
		// 4.
		System.out.println("=== 4번 ===");
	}
}
