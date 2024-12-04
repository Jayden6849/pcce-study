package day03;

public class Solution03 {
	 public int solution(int[] array) {
		 int answer = 0;
		 
		 int[] tmp = new int[array.length-1];
		 
		 int cnt = 1;
		 for(int i=0; i<array.length; i++) {
			 for(int j=i+1; j<array.length; j++) {
				 if(array[i] == array[j]) cnt++;
			 }
			 tmp[i] = cnt;
		 }
		 
		 
	     return answer;
	 }
}
