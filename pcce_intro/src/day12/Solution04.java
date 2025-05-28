package day12;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {

    public int[] solution(int n) {
        // 임의의 list를 만들고 2~n 까지 중 약수를 모두 리스트에 넣음
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n%i == 0) {
                list.add(i);
            }
        }

        // 리스트의 요소를 1~자기자신까지 나눠봤을 때 약수가 2개인 것만 남김
        for(int i=0; i<list.size(); i++) {
            int cnt = 0;
            for(int j=1; j<=list.get(i); j++) {
                if(list.get(i)%j == 0) {
                    cnt++;
                }
            }
            if(cnt != 2) {
                list.remove(i);
                i--;
            }
        }

        // list를 int[]로 변환하여 반환
        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
