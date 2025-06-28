package day05;

public class Solution05 {

    public int solution(int[] num_list) {
        // 임의의 변수 odd와 even을 선언 및 초기화
        String odd = "";
        String even = "";

        // 홀수일 때, 짝수일 때 각각 문자열에 이어붙여줌
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        // 문자열 odd와 even을 각각 정수로 바꾸어 서로 더해준 뒤 반환
        int answer = Integer.parseInt(odd) + Integer.parseInt(even);

        return answer;
    }

}
