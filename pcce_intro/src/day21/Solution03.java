package day21;

import java.util.Arrays;

public class Solution03 {

    public int solution(int[] sides) {
        // 삼각형의 3변을 모두 담을 배열 선언 및 생성
        int[] tmp = new int[sides.length+1];

        // sides[0]이 sides[1]보다 더 작도록 정렬
        Arrays.sort(sides);

        int answer = 0;
        int num = 1;
        // 기존의 두 변의 합이 새로 추가된 변보다 큰 동안만 반복문 돌림
        while(sides[0] + sides[1] > num) {
            // 매번 tmp[0], tmp[1] 값을 깊은 복사로 채워넣음
            for(int i=0; i<sides.length; i++) {
                tmp[i] = sides[i];
            }
            tmp[2] = num;

            // tmp를 오름차순으로 정렬하여 항상 tmp[2] 가 가장 크도록 판단기준을 만듦
            Arrays.sort(tmp);

            // 조건에 부합할 때만 카운팅
            if(tmp[0] + tmp[1] > tmp[2]) {
                answer++;
            }

            num++;
        }
        return answer;
    }

}
