package day07;

public class Run {
	public static void main(String[] args) {
		// 1. 특정 문자 제거하기
		Solution01 s1 = new Solution01();
		System.out.println(s1.solution("abcdef", "f"));
		System.out.println(s1.solution("BCBdbe", "B"));
	}
}
