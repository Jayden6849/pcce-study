package day11;

public class Solution05 {

    public int solution(int[] arr, int idx) {
        int answer = -1;

        // idx부터 끝까지 돌려서 1이 나오면 answer에 넣고 반복문을 멈춤
        // 문제가 이상함
        for(int i=idx; i<arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

}
