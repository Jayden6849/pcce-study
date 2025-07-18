package day12;

public class Solution02 {

    public int solution(int[] num_list) {
        int i;
        for (i=0; i<num_list.length; i++) {
            if(num_list[i] < 0)
                break;
            else if(i == num_list.length - 1)
                return -1;
        }
        return i;
    }

}
