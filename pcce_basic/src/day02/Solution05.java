package day02;

public class Solution05 {

    public String solution(String my_string, String overwrite_string, int s) {
        // 1. 쉽게 덧붙이기 위해 sb 선언 및 생성
        StringBuilder sb = new StringBuilder();

        // 2. sb에 덧붙이는데 다음과 같은 조건을 만들어줌
        // 만약 s <= i < overwrite_string.length() 일 경우 overwrite_string에서 덧붙임
        // 만약 그 이외일 경우 my_string에서 덧붙임
        for(int i=0; i<my_string.length(); i++) {
            if(s <= i && i < overwrite_string.length()+s) {
                sb.append(overwrite_string.charAt(i-s));
            } else {
                sb.append(my_string.charAt(i));
            }
        }

        // 3. StringBuilder -> String 후 반환
        return new String(sb);
    }

}
