package day11;

public class Solution03 {

    public String solution(String my_string, int[] indices) {
        // 1. 수월한 연산을 위해 StringBuilder 선언 및 생성
        StringBuilder sb = new StringBuilder();

        // 2. 문자열로 바꿔서 chArr배열의 indices의 요소에 해당하는 인덱스를 공백으로 바꾼 후 sb에 덧붙임
        char[] chArr = my_string.toCharArray();
        for(int i=0; i<chArr.length; i++) {
            for(int j=0; j<indices.length; j++) {
                chArr[indices[j]] = ' ';
            }
            sb.append(chArr[i]);
        }

        // 3. 문자열로 만들어서 공백을 빈문자열로 바꾸고 반환함
        return new String(sb).replace(" ", "");
    }

}
