package day06;

public class Solution01 {

    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int num; // 배열에 추가될 정수

        /* 추가될 정수를 파악하기 위한 조건식 */
        if(num_list[len-1] > num_list[len-2])
            num = num_list[len-1] - num_list[len-2];
        else
            num = num_list[len-1] * 2;

        /* 새로운 배열을 만들어서 요소를 집어넣어줄 예정 */
        int[] answer = new int[len+1];

        for (int i=0; i<len; i++) {
            answer[i] = num_list[i];
        }
        answer[len] = num;

        return answer;
    }

}
