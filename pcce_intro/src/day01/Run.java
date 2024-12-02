package day01;

public class Run {
	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		int n1 = s1.solution(2, 3);
		int n2 = s1.solution(100, 2);
		System.out.println(n1);
		System.out.println(n2);
		
		Solution02 s2 = new Solution02();
		n1 = s2.solution(2, 3);
		n2 = s2.solution(100, 2);
		System.out.println(n1);
		System.out.println(n2);
		
		Solution03 s3 = new Solution03();
		n1 = s3.solution(3, 4);
		n2 = s3.solution(27, 19);
		System.out.println(n1);
		System.out.println(n2);
		
		Solution04 s4 = new Solution04();
		n1 = s4.solution(10, 5);
		n2 = s4.solution(7, 2);
		System.out.println(n1);
		System.out.println(n2);
	}
}
