package day03;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		// 1. 나머지 구하기
		System.out.println("=== 1번 ===");
		
		Solution01 s1 = new Solution01();
		
		int answer1 = s1.solution(3, 2);
		System.out.println(answer1);
		int answer2 = s1.solution(10, 5);
		System.out.println(answer2);
		
		// 2. 중앙값 구하기
		System.out.println("=== 2번 ===");
		
		Solution02 s2 = new Solution02();
		
		int answer3 = s2.solution(new int[]{1, 2, 7, 10, 11});
		System.out.println(answer3);
		int answer4 = s2.solution(new int[] {9, -1, 0});
		System.out.println(answer4);
		
		// 3. 최빈값 구하기
		System.out.println("=== 3번 ===");
		
		Solution03 s3 = new Solution03();
		
		int answer5 = s3.solution(new int[] {1,2,3,3,3,4});
		System.out.println(answer5);
		int answer6 = s3.solution(new int[] {1,1,2,2});
		System.out.println(answer6);
		int answer7 = s3.solution(new int[] {1});
		System.out.println(answer7);
		
		// 4. 짝수는 싫어요
		System.out.println("=== 4번 ===");
		
		Solution04 s4 = new Solution04();
		
		int[] answer8 = s4.solution(10);
		System.out.println(Arrays.toString(answer8));
		int[] answer9 = s4.solution(15);
		System.out.println(Arrays.toString(answer9));
	}
}
