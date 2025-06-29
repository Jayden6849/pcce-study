package day07;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        // 초기값 add
        list.add(n);

        // n != 1 인 동안 연산을 반복적으로 수행하고 각 결과값을 list에 add
        while(n!=1) {
            if(n%2 == 0) {
                n /= 2;
                list.add(n);
            } else {
                n = 3*n + 1;
                list.add(n);
            }
        }

        // list -> int[]
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
