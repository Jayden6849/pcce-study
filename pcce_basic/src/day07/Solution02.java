package day07;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int[] solution(int l, int r) {
        List<String> list = new ArrayList<>();

        outer:
        for(int i=l; i<=r; i++) {
            String target = i+"";
            for(char ch : target.toCharArray()) {
                if(!(ch == '0' || ch == '5')) {
                    continue outer;
                }
            }
            list.add(target);
        }

        if(list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }

}
