package day09;

public class Solution03 {
	
	public String solution(String rsp) {
        String answer = "";
        
        char[] chArr = rsp.toCharArray();
        
        for(int i=0; i<chArr.length; i++) {
            if(chArr[i] == '2')
                answer += '0';
            else if(chArr[i] == '0')
                answer += '5';
            else if(chArr[i] == '5')
                answer += '2';
        }
        
        return answer;
    }
	
}
