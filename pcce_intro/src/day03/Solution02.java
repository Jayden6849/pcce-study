package day03;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
	public int solution(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<array.length; i++) {
            list.add(array[i]);
        }
        list.sort(Integer::compareTo);
        int length = list.size();
        
        int answer = list.get(length/2);
        
        return answer;
    }
}
