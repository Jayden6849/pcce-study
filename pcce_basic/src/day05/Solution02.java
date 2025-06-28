package day05;

public class Solution02 {

    public int solution(int a, int d, boolean[] included) {
        // 1. included의 길이만큼의 등차수열 sequence를 선언, 생성
        int[] sequence = new int[included.length];

        // 2. sequence의 각 요소를 올바른 등차수열로 초기화
        for(int i=0; i<sequence.length; i++) {
            sequence[i] = a + d*i;
        }

        // 3. included[i]의 요소가 true일때만 sequence[i]를 sum에 더해줌
        int sum = 0;
        for(int i=0; i<sequence.length; i++) {
            if(included[i] == false) continue;
            sum += sequence[i];
        }

        // 4. 반환
        return sum;
    }

}
