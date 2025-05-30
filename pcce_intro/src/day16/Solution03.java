package day16;

public class Solution03 {

    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);

        for(int i=0; i<strArr.length; i++) {
            try {
                Integer.parseInt(strArr[i]);
            } catch(NumberFormatException nfe) {
                if("+".equals(strArr[i])) {
                    answer += Integer.parseInt(strArr[i+1]);
                } else if("-".equals(strArr[i])) {
                    answer -= Integer.parseInt(strArr[i+1]);
                }
            }
        }

        return answer;
    }

}
