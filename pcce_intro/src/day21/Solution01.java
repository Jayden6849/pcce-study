package day21;

public class Solution01 {

    public int solution(String my_string) {
        my_string += " ";

        char[] chArr = my_string.replaceAll("[^0-9]", " ").toCharArray();

        String str = "";
        for(int i=0; i<chArr.length-1; i++) {
            if(!(chArr[i] == ' '))
                if(chArr[i+1] == ' ') {
                    str += chArr[i] + " ";
                } else {
                    str += chArr[i];
                }
        }

        String[] strArr = str.split(" ");

        int sum = 0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].length() == 0) {
                continue;
            }
            sum += Integer.parseInt(strArr[i]);
        }

        return sum;
    }

}
