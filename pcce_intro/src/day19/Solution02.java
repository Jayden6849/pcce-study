package day19;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        if(my_str.length()%n == 0) {
            for(int i=0; i<my_str.length()/n; i++) {
                list.add(my_str.substring(n*i, n*(i+1)));
            }
        } else {
            for(int i=0; i<my_str.length()/n; i++) {
                list.add(my_str.substring(n*i, n*(i+1)));
            }
            list.add(my_str.substring(my_str.length()-my_str.length()%n));
        }

        String[] answer = new String[list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
