package day08;

public class Solution02 {
	 public String solution(int age) {
		 String answer = "";
	     
	     // 1. 정수(매개변수)를 반복문으로 앞에서부터 소문자로 치환
	     while(age !=0)
	     {
	         answer += (char)(age%10 + 97);
	         age/=10;
	     }
	     
	     // 2. 치환시킨 문자열을 문자배열에 담아서 앞뒤 순서를 서로 바꾸어줌
	     // (일의 자리를 치환한 문자가 문자열의 가장 앞에 오도록 치환하였기 때문임)
	     char[] chArr = answer.toCharArray();
	     
	     char tmp = ' ';
	     for(int i=0; i<chArr.length/2; i++) {
	         tmp = chArr[i];
	         chArr[i] = chArr[chArr.length-1-i];
	         chArr[chArr.length-1-i] = tmp;
	     }
	     
	     // 3. 문자열로 다시 변환하여 리턴
	     answer = new String(chArr);
	     
	     return answer;
	 }
}
