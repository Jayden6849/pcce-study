package day03;

public class Solution04 {
	 public int[] solution(int n) {
		 int length = 0;
		 
		 if(n%2 == 0) length = n/2; 
		 else length = (n/2)+1;
		 
		 int[] arr = new int[length];

		 for(int i=0; i<arr.length; i++) {
			 arr[i] = (i * 2) + 1;
		 }
		 
		 return arr;
	 }
}
