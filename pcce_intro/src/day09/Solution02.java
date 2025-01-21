package day09;

public class Solution02 {
	public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        String[] arr = letter.split(" ");

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<morse.length; j++) {
				if(arr[i].equals(morse[j]))
						answer += alphabet[j];
			}
		}
        
        return answer;
    }
}
