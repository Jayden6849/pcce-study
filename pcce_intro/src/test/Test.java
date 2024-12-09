package test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int n = 29;
		
		int[] temp = new int[1000];
        
        int cnt=0;
        for(int i=1; i<=n; i++) {
        	if(n%i == 0) {
		        temp[cnt] = i;
		        cnt++;
	        }
        }
        
        int length = 0;
        
        for(int i=0; i<temp.length; i++) {
        	if(temp[i] != 0) length = i+1;
        }
        
        System.out.println(length);
        System.out.println(Arrays.toString(temp));
        
        int[] answer = new int[length];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = temp[i];
        }
        System.out.println(Arrays.toString(answer));
	}
}
