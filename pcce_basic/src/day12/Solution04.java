package day12;

public class Solution04 {

    public int[] solution(int[] arr) {
        int indexS = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                indexS = i;
                break;
            }
        }

        int indexE = 0;
        for(int i=(arr.length-1); i>=0; i--) {
            if(arr[i] == 2) {
                indexE = i;
                break;
            }
        }

        if(indexS == 0 && indexE == 0) {
            return new int[] {-1};
        } else if(indexS == indexE) {
            return new int[] {2};
        } else {
            int[] answer = new int[indexE - indexS +1];

            for(int i=0; i<answer.length; i++) {
                answer[i] = arr[i+indexS];
            }

            return answer;
        }
    }

}
