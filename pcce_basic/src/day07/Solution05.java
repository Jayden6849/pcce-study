package day07;

import java.util.LinkedList;

public class Solution05 {

    public int[] solution(int[] arr) {
        LinkedList<Integer> stkList = new LinkedList<>();

        for(int i=0; i<arr.length; ) {
            if(stkList.isEmpty()) {
                stkList.add(arr[i]);
                i++;
            } else if(stkList.getLast() < arr[i]) {
                stkList.add(arr[i]);
                i++;
            } else if(stkList.getLast() >= arr[i]) {
                stkList.remove(stkList.getLast());
            }
        }

        int[] stk = new int[stkList.size()];
        for(int i=0; i<stk.length; i++) {
            stk[i] = stkList.get(i);
        }

        return stk;
    }

}
