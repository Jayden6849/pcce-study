package day03;

public class Solution03 {
	 public int solution(int[] array) {
	        int answer = 0;
	        
	        int[] count = new int[2000];
			int n;
			
			for(int i=0; i<array.length; i++) {
				n = array[i];
				count[n]++;
			}
	        
	        int max = count[0];
			for(int i=0; i<count.length; i++) {
				if(max<count[i]) max = count[i];
			}
	        
	        int chk = 0;
			for(int i=0; i<count.length; i++) {
				if(max == count[i]) {
					answer = i;
					chk++;
				}
			}
			
			if(chk != 1) { 
				for(int i=0; i<count.length; i++) {
					answer = -1;
				}
			}
	        
	        return answer;
	 }
}
