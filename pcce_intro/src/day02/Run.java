package day02;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		System.out.println("=== Solution01 ===");
		Solution01 s1 = new Solution01();
		
		int n1 = s1.solution(3, 2);
		int n2 = s1.solution(7, 3);
		int n3 = s1.solution(1, 16);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println("=== Solution02 ===");
		Solution02 s2 = new Solution02();
		
		int result1 = s2.solution(2, 3);
		int result2 = s2.solution(11, 11);
		int result3 = s2.solution(7, 99);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println("=== Solution03 ===");
		Solution03 s3 = new Solution03();

		int[] r1 = s3.solution(1, 2, 3, 4);
		System.out.println(Arrays.toString(r1));
		int[] r2 = s3.solution(9, 2, 1, 3);
		System.out.println(Arrays.toString(r2));
		
		System.out.println("=== Solution04 ===");
		Solution04 s4 = new Solution04();
		
		int[] numbers1 = {1, 2, 3, 4, 5};
		int[] ns1 = s4.solution(numbers1);
		System.out.println(Arrays.toString(ns1));
		int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
		int[] ns2 = s4.solution(numbers2);
		System.out.println(Arrays.toString(ns2));
		
	}
}
