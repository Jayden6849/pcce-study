package day13;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<str_list.length; i++) {
            if("l".equals(str_list[i])) {
                for(int j=0; j<i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if("r".equals(str_list[i])) {
                for(int j=i+1; j<str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;
            }
        }

        return list.stream().toArray(String[]::new);
    }

}
