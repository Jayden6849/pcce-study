package day08;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		// 1. 배열 자르기
		System.out.println("===== 1번 ======");
		Solution01 s1 = new Solution01();
		System.out.println(Arrays.toString(s1.solution(new int[] {1, 2, 3, 4, 5}, 1, 3)));
		System.out.println(Arrays.toString(s1.solution(new int[] {1,3,5}, 1, 2)));
		// 2. 외계행성의 나이
		System.out.println("===== 2번 ======");
		Solution02 s2 = new Solution02();
		System.out.println(s2.solution(23));
		System.out.println(s2.solution(51));
		System.out.println(s2.solution(100));
		// 3. 진료순서 정하기
		System.out.println("===== 3번 ======");
		Solution03 s3 = new Solution03();
		System.out.println(Arrays.toString(s3.solution(new int[] {3,76,24})));
		System.out.println(Arrays.toString(s3.solution(new int[] {1,2,3,4,5,6,7})));
		System.out.println(Arrays.toString(s3.solution(new int[] {30,10,23,6,100})));
		// 4. 순서쌍의 개수
		System.out.println("===== 4번 ======");
		Solution04 s4 = new Solution04();
		System.out.println(s4.solution(20));
		System.out.println(s4.solution(100));
	}
}
