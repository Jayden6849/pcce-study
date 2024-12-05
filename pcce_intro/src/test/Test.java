package test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4};
		
		int[] count = new int[2000];
		int n;
		
		for(int i=0; i<array.length; i++) {
			n = array[i];
			count[n]++;
		}
		
		System.out.println(Arrays.toString(count));
		
		int max = count[0];
		for(int i=0; i<count.length; i++) {
			if(max<count[i]) max = count[i];
		}
		
		System.out.println(max);
		
		int result = -1;
		
		for(int i=0; i<count.length; i++) {
			if(max == count[i]) {
				result = i;
			} 
		}
		
		System.out.println(result);
		
	}
}
