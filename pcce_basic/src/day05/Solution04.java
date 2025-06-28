package day05;

public class Solution04 {

    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;

        for (int i=0; i<num_list.length; i++) {
            sum += num_list[i];
            multiply *= num_list[i];
        }

        /** 같으면 어떻게 되는거임? 0 반환하는게 맞음? **/
        return (sum*sum > multiply) ? 1 : 0;
    }

}
