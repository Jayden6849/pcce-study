package day06;

import java.util.Scanner;

public class Solution02 {
	public void solution() {
		// 1. 스캐너로 정수 입력받기
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    
	    // 2. 이중 for문을 통해 원하는 내용을 출력
	    for(int i=1; i<=n; i++) {
	        for(int j=1; j<=i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    sc.close();
	}
}
