package day14;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        // 길이를 모르기때문에 잠시 넣어둘 리스트 선언 및 생성
        List<String> list = new ArrayList<>();

        // finished가 false라면 임의의 리스트에 추가해둠
        for (int i = 0; i < todo_list.length; i++) {
            for (i = 0; i < finished.length; i++) {
                if (finished[i] == false) {
                    list.add(todo_list[i]);
                }
            }
        }

        // arraylist -> array
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
